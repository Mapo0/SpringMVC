package com.epam.controller;

import com.epam.dto.User;
import com.epam.dto.UserRole;
import com.epam.manager.SessionUserManager;
import com.epam.repository.CategoryRepository;
import com.epam.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Modifier;

@Controller
public class MainController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private SessionUserManager sessionUserManager;
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("category", categoryRepository.getCategory());
        User user= sessionUserManager.getCurrentSessionUser();
        model.addAttribute("user", user.getLogin());
        model.addAttribute("user1",user.getUserRole());
        return "index";
    }
    @RequestMapping("/admin")
    public String admin(Model model){
        User admin = sessionUserManager.getCurrentSessionUser();
        model.addAttribute("admin", admin.getUserRole().equals(UserRole.ADMIN));
        return "admin";
    }

}
