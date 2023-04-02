package com.example.spring;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private final List<Product> products=new ArrayList<>();

    public ProductRepository(){
        products.add(new Product("컴퓨터", 3000L));
        products.add(new Product("키보드", 2000L));
        products.add(new Product( "마우스", 1000L));
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public List<Product> findAll(){
        return products;
    }
    public Product findOne(int id){
        return products.get(id);
    }
}
