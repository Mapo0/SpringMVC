package com.epam.dto;

public class Product {
    private String name;
    private int id;
    private int cost;


    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Product(String name, int id, int cost) {
        this.name = name;
        this.id = id;
        this.cost = cost;
    }
}
