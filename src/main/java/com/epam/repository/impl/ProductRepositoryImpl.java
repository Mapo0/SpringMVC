package com.epam.repository.impl;

import com.epam.dto.Product;
import com.epam.repository.ProductRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    private List<Product> productList=new ArrayList<>();

    public ProductRepositoryImpl(){
        productList.add(new Product("text1",0,1000));
        productList.add(new Product("text2",1,2000));
        productList.add(new Product("text3",2,3000));
        productList.add(new Product("text4",3,4000));

    }
    @Override
    public Product getProductById(int id) {
        return null;
    }

    @Override
    public Product getProductByName(String name) {
        return null;
    }

    @Override
    public List<Product> getProductList() {
        return null;
    }
}
