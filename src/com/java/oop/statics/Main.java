package com.java.oop.statics;

public class Main {
    public static void main(String[] args) {
        //Product.VENDOR_NAME = "Lenovo";
        System.out.println(Product.VENDOR_NAME);

        Product product = new Product(1,"laptop",3423,4.5f,23423,(byte)10,true,"lenovo", "laptop");

        System.out.println(product.id);

        Product product1 = new Product(2,"laptop2",3423,4.5f,23423,(byte)10,true,"lenovo", "laptop");
        System.out.println(product1.id);

        Product.displayVendorDetails();

        //product1.VENDOR_NAME = "Samsung";

        System.out.println(Product.VENDOR_NAME);
        System.out.println(Product.VENDOR_NAME);
    }
}
