package com.epam.controller;


import com.epam.repository.ProductRepository;
import com.epam.repository.impl.ProductRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


@Controller
public class AuthController {
    @Autowired
    private ProductRepository productRepository;
//    @RequestMapping("/index")
//    public String welcome() {
//        return "index";
//    }
//
//    @GetMapping("/login")
//    public ModelAndView login(ModelAndView modelAndView) {
//        modelAndView.setViewName("login");
//        return modelAndView;
//    }

    @RequestMapping("/index")
    public String welcome(Model model){
        model.addAttribute("product", productRepository.getProductList());
//        model.addAttribute("name", productRepository.getProductByName());
//        model.addAttribute("id", productRepository.getProductById());
        return "index";
    }

}
