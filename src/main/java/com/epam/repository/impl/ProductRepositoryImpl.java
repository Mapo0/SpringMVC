package com.epam.repository.impl;

import com.epam.dto.Product;
import com.epam.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private List<Product> productList=new ArrayList<>();

    public ProductRepositoryImpl(){
        productList.add(new Product("text1",0,1000));
        productList.add(new Product("text2",1,2000));
        productList.add(new Product("text3",2,3000));
        productList.add(new Product("text4",3,4000));

        productList.add(new Product("text5",4,5000));
        productList.add(new Product("text6",5,6000));
        productList.add(new Product("text7",6,7000));
        productList.add(new Product("text8",7,8000));

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
}
