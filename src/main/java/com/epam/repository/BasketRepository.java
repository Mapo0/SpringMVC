package com.epam.repository;

import com.epam.dto.Product;

import java.util.List;

public interface BasketRepository {

    void addItem (Product item);

    void deleteItem (Product item);

    List<Product> getProductList ();


}
