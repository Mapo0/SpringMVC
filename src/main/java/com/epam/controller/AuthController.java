package com.epam.controller;


import com.epam.dto.User;
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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



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

    @PostMapping("login")
    public ModelAndView login(User user, ModelAndView modelAndView) {
        User foundUser = userService.getUserRepository(user.getLogin());
      

        if (foundUser == null) {
            modelAndView.setViewName("index");
            return modelAndView;
        }
        sessionUserManager.setCurrentSessionUser(foundUser);
        return new ModelAndView("redirect:","user", foundUser);
    }



}
