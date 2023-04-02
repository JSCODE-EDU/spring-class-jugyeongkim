package com.example.spring;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("api/products")
@RestController
public class ProductController {

    private final ProductService productservice;

    public ProductController(ProductService productservice) {
        this.productservice = productservice;

    }
    @PostMapping("")
    public String saveProduct(@RequestBody ProductEntity productEntity){
        productservice.save(productEntity);
        return productEntity.toString()+"저장하였습니다.";
    }

    @GetMapping("")
    public List<ProductEntity> findAll(){
        return productservice.findAll();
    }

    @GetMapping(value = "",params = "id")
    public Optional<ProductEntity> findOne(@RequestParam Long id){
        return productservice.findOne(id);
    }
}
