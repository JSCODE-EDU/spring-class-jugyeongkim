package com.example.spring;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductJpaRepository productJpaRepository;

    public ProductService(ProductJpaRepository productJpaRepository) {

        this.productJpaRepository = productJpaRepository;
    }

    public List<ProductEntity> findAll(){
        return productJpaRepository.findAll();
    }

    public void save(ProductEntity productEntity) {
        productJpaRepository.save(productEntity);
    }

    public Optional<ProductEntity> findOne(Long id) {
        return productJpaRepository.findById(id);
    }
}
