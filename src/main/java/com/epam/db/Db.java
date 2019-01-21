package com.epam.db;

import com.epam.dto.Category;
import com.epam.dto.Product;
import com.epam.repository.impl.CategoryRepositoryImpl;
import com.epam.repository.impl.ProductRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Db {
    @Autowired
    private  ProductRepositoryImpl productRepository;
    @Autowired
    private  CategoryRepositoryImpl categoryRepository;

    @PostConstruct
    public void db(){
         List<Product> clotherList=new ArrayList<>();
        List<Product> accessList=new ArrayList<>();

        clotherList.add(new Product("text1",0,1000));
        clotherList.add(new Product("text2",1,2000));
        clotherList.add(new Product("text3",2,3000));
        clotherList.add(new Product("text4",3,4000));

        accessList.add(new Product("text5",4,5000));
        accessList.add(new Product("text6",5,6000));
        accessList.add(new Product("text7",6,7000));
        accessList.add(new Product("text8",7,8000));

        productRepository.setProducts(clotherList);
        productRepository.setProducts(accessList);

        List<Category> categories = new ArrayList<>();

        categories.add(new Category("Одежда",2,clotherList));
        categories.add(new Category("Аксессуары",1,accessList));

        categoryRepository.setCategory(categories);
    }
}
