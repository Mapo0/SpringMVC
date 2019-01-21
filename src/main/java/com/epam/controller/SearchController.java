package com.epam.controller;

import com.epam.dto.AjaxResp;
import com.epam.dto.Category;
import com.epam.dto.SearchCriteria;
import com.epam.service.CategoryService;
import com.epam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.validation.Valid;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@RestController
//public class SearchController {
//
//    CategoryService categoryService;
//
//    @Autowired
//    public void setUserService(ProductService productService) {
//        this.categoryService = categoryService;
//    }
//
//    @PostMapping("/api/search")
//    public ResponseEntity<?> getSearchResultViaAjax(
//            @Valid @RequestBody SearchCriteria search, Errors errors) {
//
//        AjaxResp result = new AjaxResp();
//
//        //If error, just return a 400 bad request, along with the error message
//        if (errors.hasErrors()) {
//
//            result.setMsg(errors.getAllErrors()
//                    .stream().map(x -> x.getDefaultMessage())
//                    .collect(Collectors.joining(",")));
//
//            return ResponseEntity.badRequest().body(result);
//
//        }
//
//        List<Category> categoryList = categoryService.getCategoryFindName(search.getCategoryName());
//        if (categoryList.isEmpty()) {
//            result.setMsg("no user found!");
//        } else {
//            result.setMsg("success");
//        }
//        result.setResult(categoryList);
//
//        return ResponseEntity.ok(result);
//
//    }
//
//}

