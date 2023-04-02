package com.example.spring;

import javax.persistence.*;
@Table
@Entity
public class TestTable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column
    private String name;
    public TestTable(){}

}
