package com.epam.repository.impl;

import com.epam.dto.Product;
import com.epam.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private List<Product> productList ;

    public ProductRepositoryImpl() {
        this.productList = new ArrayList<>();
    }

    @Override
    public Product getProductById(int id) {

        return productList.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElseThrow(NullPointerException::new);
    }

    @Override
    public Product getByCost(int cost) { return null;
    }

    @Override
    public Product getProductByName(String name) {
        return productList.stream()
                .filter(product -> product.getName()== name)
                .findFirst()
                .orElseThrow(NullPointerException::new);
    }

    @Override
    public List<Product> getProductList() {
        return productList;

    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product deleteProduct(int id) {
        return null;
    }

    @Override
    public Product update(Product product) {
        return null;
    }

    public void setProducts(List<Product> products) {
        productList.addAll(products);
    }

}
