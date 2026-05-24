package com.java.oop.collections;

import com.java.oop.collections.model.Product;

import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Product> products = new LinkedList<>();
        Product product1 = new com.java.oop.collections.model.Product();
        product1.setId(1111);
        product1.setName("Asus vivo book");
        product1.setMaxRetailPrice(68999);
        product1.setDiscountPercentage(10);
        product1.setAvailable(true);
        product1.setCompany("Asus");
        product1.setCategory("Laptop");
        product1.setManufacturedYear(2023);
        com.java.oop.collections.model.Product product2 = new com.java.oop.collections.model.Product();
        product2.setId(2222);
        product2.setName("HP chrome book");
        product2.setMaxRetailPrice(78999);
        product2.setDiscountPercentage(11);
        product2.setAvailable(true);
        product2.setCompany("HP");
        product2.setCategory("Laptop");
        product2.setManufacturedYear(2023);
        com.java.oop.collections.model.Product product3 = new com.java.oop.collections.model.Product();
        product3.setId(3333);
        product3.setName("Mac book");
        product3.setMaxRetailPrice(98999);
        product3.setDiscountPercentage(5);
        product3.setAvailable(true);
        product3.setCompany("Apple");
        product3.setCategory("Laptop");
        product3.setManufacturedYear(2023);
        com.java.oop.collections.model.Product product4 = new Product();
        product4.setId(3333);
        product4.setName("Mac book");
        product4.setMaxRetailPrice(98999);
        product4.setDiscountPercentage(5);
        product4.setAvailable(true);
        product4.setCompany("Apple");
        product4.setCategory("Laptop");
        product4.setManufacturedYear(2023);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        System.out.println(products);
        System.out.println(products.size());
        System.out.println(products.get(0));
        for (Product product : products) {
            System.out.println(product.getCompany());
        }
    }
}
