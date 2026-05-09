package com.java.oop.abstraction;

public class ApplicationForm {
    int id;
    String name;
    Customer customer;
    ApplicationForm(int id, String name, Customer customer){
        this.id = id;
        this.name = name;
        this.customer = customer;
    }
}
