package com.epam.dto;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private int id;
    private List<Product> category ;

    public Category() {
    }

    public Category(String name,int id, List<Product> category) {
        this.name = name;
        this.id = id;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getCategory() {
        return category;
    }

    public void setCategory(List<Product> category) {
        this.category = category;
    }
}
