package com.epam.service.impl;

import com.epam.dto.Category;
import com.epam.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    private List<Category> categories;

    @Override
    public List<Category> getCategoryFindName(String name) {
        List<Category> result = categories.stream()
                .filter(x -> x.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());

        return result;
    }
}
