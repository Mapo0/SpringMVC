package com.epam.repository.impl;

import com.epam.dto.Product;
import com.epam.repository.BasketRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class BasketRepositoryImpl implements BasketRepository {
    @Override
    public void addItem(Product item) {

    }

    @Override
    public void deleteItem(Product item) {

    }

    @Override
    public List<Product> getProductList() {
        return null;
    }
}
