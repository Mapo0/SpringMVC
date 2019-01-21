package com.epam.controller;

import com.epam.dto.*;
import com.epam.manager.SessionUserManager;
import com.epam.repository.CategoryRepository;
import com.epam.repository.ProductRepository;
import com.epam.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MainController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private SessionUserManager sessionUserManager;

    CategoryService categoryService;

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

    @PostMapping("/api/search")
    public ResponseEntity<?> getSearchResultViaAjax(
            @Valid @RequestBody SearchCriteria search, Errors errors) {

        AjaxResp result = new AjaxResp();

        //If error, just return a 400 bad request, along with the error message
        if (errors.hasErrors()) {

            result.setMsg(errors.getAllErrors()
                    .stream().map(x -> x.getDefaultMessage())
                    .collect(Collectors.joining(",")));

            return ResponseEntity.badRequest().body(result);

        }

        List<Category> categoryList = categoryService.getCategoryFindName(search.getCategoryName());
        if (categoryList.isEmpty()) {
            result.setMsg("no user found!");
        } else {
            result.setMsg("success");
        }
        result.setResult(categoryList);

        return ResponseEntity.ok(result);

    }

}
