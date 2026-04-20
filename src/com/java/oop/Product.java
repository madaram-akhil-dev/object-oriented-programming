package com.java.oop;

public class Product {
    int id;
    String name;
    int maxRetailPrice;
    float rating;
    int reviewsCount;
    byte discountPercentage;
    boolean isAvailable;
    String companyName;
    String category;
    //no-arg constructor
    Product(){
        System.out.println("Product Constructor Called");
    }

}
