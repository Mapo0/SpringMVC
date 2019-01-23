package com.epam.repository.impl;

import com.epam.dto.Product;
import com.epam.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private List<Product> productList ;

    private Product product;

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
    public void createProduct(Product product) {
       productList.add(product);
    }

    @Override
    public void deleteProduct(int id) {
        productList.remove(getProductById(id));
    }

    @Override
    public void update(Product product) {
        
    }

    public void setProducts(List<Product> products) {
        productList.addAll(products);
    }

}
