package com.epam.controller;

import com.epam.dto.Product;
import com.epam.repository.ProductRepository;
import com.epam.service.CategoryService;
import com.epam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class RESTController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private HttpServletRequest httpServletRequest;

//    @GetMapping
//    public List<Product> productList(){
//        return productService.getProductRepository();
//    }

    @GetMapping("{id}")
    public Product getProduct(@PathVariable int id) {
        return productService.getProductById(id);
    }

//    @PostMapping
//    public Product createProduct(@RequestBody Product product) {
//        int newProductId = productService.lastID();
//        product.setId(++newProductId);
//        productService.createProduct(product);
//        return product;
//    }

    @PutMapping("update")
    public Product updateProduct(@RequestBody Product product) {
        return  null ;
    }

    @DeleteMapping("delete/{id}")
    public void deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
    }
}