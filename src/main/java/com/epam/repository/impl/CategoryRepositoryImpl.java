package com.epam.repository.impl;

import com.epam.dto.Category;
import com.epam.dto.Product;
import com.epam.repository.CategoryRepository;
import com.epam.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

    private List<Category> categoriesList;

    public CategoryRepositoryImpl() {
        this.categoriesList = new ArrayList<>();
    }

    @Override
    public List<Category> getCategory() {
        return categoriesList;
    }

    @Override
    public void setCategory(List<Category> categories) {
        categoriesList.addAll(categories);
    }
}
