package com.java.oop;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.id = 123;
        product.name = "Asus Vivo book";
        product.maxRetailPrice = 88990;
        product.rating = 3.8f;
        product.reviewsCount = 145;
        product.discountPercentage = 25;
        product.isAvailable = true;
        product.companyName =" Asus";
        product.category = "Laptop";
        System.out.println("Product Id : " + product.id);
        System.out.println("Product Name : " + product.name);
        System.out.println("Product Max Retail Price : " + product.maxRetailPrice);
        System.out.println("Product Rating : " + product.rating);
        System.out.println("Product Reviews Count : " + product.reviewsCount);
        System.out.println("Product Discount Percentage : " + product.discountPercentage + "%" + "(off)");
        System.out.println("Product Availability : " + product.isAvailable);
        System.out.println("Company Name : " + product.companyName);
        System.out.println("Category : " + product.category);
        Product product1 = new Product();
        product1.id = 124;
        product1.name = "Lenovo Idea Pad ";
        product1.maxRetailPrice = 66990;
        product1.rating = 4.0f;
        product1.reviewsCount = 84;
        product1.discountPercentage = 19;
        product1.isAvailable = true;
        product1.companyName =" Lenovo";
        product1.category = "Laptop";
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Product Id : " + product1.id);
        System.out.println("Product Name : " + product1.name);
        System.out.println("Product Max Retail Price : " + product1.maxRetailPrice);
        System.out.println("Product Rating : " + product1.rating);
        System.out.println("Product Reviews Count : " + product1.reviewsCount);
        System.out.println("Product Discount Percentage : " + product1.discountPercentage + "%" + "(off)");
        System.out.println("Product Availability : " + product1.isAvailable);
        System.out.println("Company Name : " + product1.companyName);
        System.out.println("Category : " + product1.category);



    }
}