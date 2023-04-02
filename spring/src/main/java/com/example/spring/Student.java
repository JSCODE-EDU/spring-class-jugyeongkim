package com.example.spring;

import javax.persistence.*;

@Table
@Entity
public class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column
    private String sname;
    @Column
    private String sclass;

    public Student(){

    }
}
