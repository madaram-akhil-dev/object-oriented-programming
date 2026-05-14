package com.java.oop.statics;

public class Product {
    int id;
    String name;
    int maxRetailPrice;
    float rating;
    int reviewsCount;
    byte discountPercentage;
    boolean isAvailable;
    String company;
    String category;

    final static String VENDOR_NAME = "Lenovo";
    final static String VENDOR_ADDRESS = "123 Main Street, City, State, Zip Code";
    final static String VENDOR_EMAIL = "vendor@gmail.com";

    public Product(int id, String name, int maxRetailPrice, float rating, int reviewsCount, byte discountPercentage, boolean isAvailable, String company, String category) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.rating = rating;
        this.reviewsCount = reviewsCount;
        this.discountPercentage = discountPercentage;
        this.isAvailable = isAvailable;
        this.company = company;
        this.category = category;
    }

    static void displayVendorDetails() {
        System.out.println("Vendor Name: " + VENDOR_NAME);
        System.out.println("Vendor Address: " + VENDOR_ADDRESS);
        System.out.println("Vendor Email: " + VENDOR_EMAIL);

    }

    void displayProductDetails() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Max Retail Price: " + maxRetailPrice);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews Count: " + reviewsCount);
        System.out.println("Discount Percentage: " + discountPercentage);
        System.out.println("Is Available: " + isAvailable);
        System.out.println("Company: " + company);
        System.out.println("Category: " + category);
        System.out.println("Vendor Name : " + VENDOR_NAME);
    }
}
