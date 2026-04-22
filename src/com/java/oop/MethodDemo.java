package com.java.oop;

public class MethodDemo {
    int calculateFinalPrice(Product product) {
        return product.maxRetailPrice - (product.maxRetailPrice * product.discountPercentage / 100);
    }

    void displayProduct(Product product) {
        System.out.println("\n-----------------------------------------------------------------------------\n");
        System.out.println("Product Name:" + product.name);
        System.out.println("Price:" + product.maxRetailPrice);
        System.out.println("Price:" + calculateFinalPrice(product));
    }
}
