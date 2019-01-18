package com.epam.repository;

import com.epam.dto.Product;

import java.util.List;

public interface ProductRepository {

    Product getProductById (int id);

    Product getByCost(int cost);

    Product getProductByName (String name);

    List<Product> getProductList();
}
