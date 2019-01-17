package com.epam.dto;

public class Basket {
    private int id;
    private String name;
    private int cost;

    public Basket() {
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Basket(int id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
}
