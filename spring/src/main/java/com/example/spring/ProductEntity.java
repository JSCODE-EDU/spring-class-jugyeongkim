package com.example.spring;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name="product_entity")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    @JsonProperty(value = "name")
    private String name;

    @Column(name="price")
    @JsonProperty(value = "price")
    private Long price;


    public ProductEntity() {

    }
}
