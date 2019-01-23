package com.epam.service;

import com.epam.dto.Product;

import java.util.List;

public interface ProductService {

   public List<Product> getProductRepository(String name);

    Product getProductById(int id);

     void  deleteProduct (int id);

     Product getByCOst (int cost);

   Product getProductByName (String name);

   void createProduct (Product product);

   void update (Product product);
}
