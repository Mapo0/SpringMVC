package com.epam.controller;

import com.epam.dto.User;
import com.epam.manager.SessionUserManager;
import com.epam.repository.CategoryRepository;
import com.epam.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private SessionUserManager sessionUserManager;
    @RequestMapping("/index")
    public String welcome(Model model){
        model.addAttribute("category", categoryRepository.getCategory());
        User user= sessionUserManager.getCurrentSessionUser();
        model.addAttribute("user", user.getLogin());
        return "index";
    }
}
