package com.epam.controller;

import com.epam.repository.ProductRepository;
import com.epam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RESTController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductService productService;

//    @RequestMapping("/admin")
//    public String admin(Model model){
//
//        return ;
//    }
}
