package com.epam.controller;


import ch.qos.logback.core.net.server.Client;
import com.epam.dto.User;
import com.epam.dto.UserRole;
import com.epam.manager.SessionUserManager;
import com.epam.repository.ProductRepository;
import com.epam.repository.UserRepository;
import com.epam.repository.impl.ProductRepositoryImpl;
import com.epam.repository.impl.UserRepositoryImpl;
import com.epam.service.UserService;
import com.epam.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
public class AuthController {
    @Autowired
    UserServiceImpl userService;
    @Autowired
    SessionUserManager sessionUserManager;

    @GetMapping("/login")
    public ModelAndView login(ModelAndView modelAndView) {
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @PostMapping("/login")
    public String login (User user, ModelAndView modelAndView) {
        User foundUser = userService.getUserRepository(user);

        if (foundUser == null) {
            return "error";
        }

        sessionUserManager.setCurrentSessionUser(foundUser);
        foundUser.getUserRole().equals(UserRole.CLIENT);
        return "redirect:/index";

    }

    @GetMapping("logout")
    public ModelAndView logout(ModelAndView modelAndView, HttpServletRequest httpServletRequest) {
        httpServletRequest.getSession().invalidate();
        modelAndView.setViewName("redirect:/login");
        return modelAndView;
    }
}
