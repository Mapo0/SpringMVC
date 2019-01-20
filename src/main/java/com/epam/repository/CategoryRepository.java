package com.epam.repository;



import com.epam.dto.Category;

import java.util.List;

public interface CategoryRepository {


    List<Category> getCategory();

    void setCategory(List<Category> categories);
}
