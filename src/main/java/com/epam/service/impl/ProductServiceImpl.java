package com.epam.service.impl;

import com.epam.dto.Product;
import com.epam.repository.ProductRepository;
import com.epam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    private List<Product> productList = new ArrayList<>();
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> getProductRepository(String name) {
        return productRepository.getProductList();
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.getProductById(id);
    }

    @Override
    public void  deleteProduct(int id) {
       productRepository.getProductById(id);
    }

    @Override
    public Product getByCOst(int cost) {
        return productRepository.getByCost(cost);
    }

    @Override
    public Product getProductByName(String name) {
        return productRepository.getProductByName(name);
    }

    @Override
    public void createProduct(Product product) {
            productRepository.createProduct(product);
    }

    @Override
    public void update(Product product) {
            productRepository.update(product);
    }

    @Override
    public int lastID(int id) {
        return productList.size() - 1;
    }
}
