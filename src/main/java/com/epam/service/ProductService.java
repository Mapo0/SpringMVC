package com.epam.service;

import com.epam.dto.Product;

import java.util.List;

public interface ProductService {

   public List<Product> getProductRepository(String name);
}
