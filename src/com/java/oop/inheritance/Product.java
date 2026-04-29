package com.java.oop.inheritance;

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

    public Product(int id, String name, int maxRetailPrice, float rating, int reviewsCount, byte discountPercentage, boolean isAvailable, String companyName, String category) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.rating = rating;
        this.reviewsCount = reviewsCount;
        this.discountPercentage = discountPercentage;
        this.isAvailable = isAvailable;
        this.companyName = companyName;
        this.category = category;
    }
    void displayProductDetails(){
        System.out.println("Product Id: " + id);
        System.out.println(" Product Name: " + name);
        System.out.println(" Product Price: " + maxRetailPrice);
        System.out.println(" Rating: " + rating);
        System.out.println(" Reviews Count: " + reviewsCount);
        System.out.println(" Discount Percentage: " + discountPercentage);
        System.out.println(" Product Availability: " + isAvailable);
        System.out.println(" Company Name: " + companyName);
        System.out.println(" Category: " + category);
    }
}
