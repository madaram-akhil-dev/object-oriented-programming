package com.java.oop.collections;

import java.util.HashSet;

public class SetTest {
    public static void main(String[] args) {
        HashSet<Product> productSet = new HashSet<Product>();
        productSet.add(new Product(1,"Asus laptop",68999));
        productSet.add(new Product(2,"Dell laptop",58959));
        productSet.add(new Product(3,"lenovo laptop",88959));
        productSet.add(new Product(3,"lenovo laptop",88959));
        System.out.println(productSet);

    }
}
