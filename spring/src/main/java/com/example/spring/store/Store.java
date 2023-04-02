package com.example.spring.store;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Table
@Entity
public class Store {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column
    @JsonProperty(value = "name")
    private String name;
    @Column
    @JsonProperty(value = "addr")
    private String addr;
    @Column
    @JsonProperty(value = "phonenumber")
    private String phonenumber;
}
