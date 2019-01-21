package com.epam.dto;

import org.hibernate.validator.constraints.NotBlank;

public class SearchCriteria {
    @NotBlank(message = "categoryName can't empty!")
    String categoryName;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
