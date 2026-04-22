package com.java.oop;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println("\n---------------------------------------------------------------------------\n");
        System.out.println("Customer ID : " + customer.id);
        System.out.println("Customer Name : " + customer.name);
        System.out.println("Customer Age : " + customer.age);
        System.out.println("Customer Gender : " + customer.gender);
        System.out.println("Customer Mobile Number : " + customer.mobileNumber);
        System.out.println("Customer Email : " + customer.email);
        System.out.println("Customer Address : " + customer.address);
        System.out.println("-------------------------------------------------------------------------------");

        Customer customer1 = new Customer();
        customer1.id = 110;
        customer1.name = "Akhil";
        customer1.age = 24;
        customer1.gender = "male";
        customer1.email = "akhil@gmail.com";
        customer1.mobileNumber = 9866476371L;
        customer1.address = "Hno: 12-6-2/103, kukatpally, Hyderabad";
        System.out.println("\n---------------------------------------------------------------------------\n");
        System.out.println("Customer ID : " + customer1.id);
        System.out.println("Customer Name : " + customer1.name);
        System.out.println("Customer Age : " + customer1.age);
        System.out.println("Customer Gender : " + customer1.gender);
        System.out.println("Customer Mobile Number : " + customer1.mobileNumber);
        System.out.println("Customer Email : " + customer1.email);
        System.out.println("Customer Address : " + customer1.address);
        System.out.println("-------------------------------------------------------------------------------");

        Customer customer2 = new Customer(112, "Suhan", (byte) 25, "Male", 9955887744L, "Suhan@gmail.com", "Flat no: 102, Kp,HYD");
        System.out.println("\n------------------------------------------------------------------------------\n");
        System.out.println("Customer ID : " + customer2.id);
        System.out.println("Customer Name : " + customer2.name);
        System.out.println("Customer Age : " + customer2.age);
        System.out.println("Customer Gender : " + customer2.gender);
        System.out.println("Customer Mobile Number : " + customer2.mobileNumber);
        System.out.println("Customer Email : " + customer2.email);
        System.out.println("Customer Address : " + customer2.address);
        System.out.println("\n---------------------------------------------------------------------------\n");


        Product product = new Product();
        product.id = 123;
        product.name = "Asus Vivo book";
        product.maxRetailPrice = 88990;
        product.rating = 3.8f;
        product.reviewsCount = 145;
        product.discountPercentage = 25;
        product.isAvailable = true;
        product.companyName = "Asus";
        product.category = "Laptop";
        int finalPrice = product.maxRetailPrice - (product.maxRetailPrice * product.discountPercentage / 100);

        if (product.isAvailable) {
            System.out.println("Product Id : " + product.id);
            System.out.println("Product Name : " + product.name);
            System.out.println("Product Max Retail Price : " + product.maxRetailPrice);
            System.out.println("Product Rating : " + product.rating);
            System.out.println("Product Reviews Count : " + product.reviewsCount);
            System.out.println("Product Discount Percentage : " + product.discountPercentage + "%" + "(off)");
            System.out.println("Product Availability : " + product.isAvailable);
            System.out.println("Company Name : " + product.companyName);
            System.out.println("Category : " + product.category);
            System.out.println("Final Price After discount : " + finalPrice);
        }
        MethodDemo demo = new MethodDemo();
        demo.displayProduct(product);
        Product product1 = new Product();
        product1.id = 124;
        product1.name = "Lenovo Idea Pad ";
        product1.maxRetailPrice = 66990;
        product1.rating = 4.0f;
        product1.reviewsCount = 84;
        product1.discountPercentage = 19;
        product1.isAvailable = true;
        product1.companyName = "Lenovo";
        product1.category = "Laptop";
        int finalPrice1 = product1.maxRetailPrice - (product1.maxRetailPrice * product1.discountPercentage / 100);

        if (product1.isAvailable) {
            System.out.println("\n------------------------------------------------------------------------------\n");
            System.out.println("Product Id : " + product1.id);
            System.out.println("Product Name : " + product1.name);
            System.out.println("Product Max Retail Price : " + product1.maxRetailPrice);
            System.out.println("Product Rating : " + product1.rating);
            System.out.println("Product Reviews Count : " + product1.reviewsCount);
            System.out.println("Product Discount Percentage : " + product1.discountPercentage + "%" + "(off)");
            System.out.println("Product Availability : " + product1.isAvailable);
            System.out.println("Company Name : " + product1.companyName);
            System.out.println("Category : " + product1.category);
            System.out.println("Final Price After discount : " + finalPrice1);
        }
        Product product2 = new Product();
        product2.id = 125;
        product2.name = "Dell 15  Inspiron";
        product2.maxRetailPrice = 68990;
        product2.rating = 3.7f;
        product2.reviewsCount = 488;
        product2.discountPercentage = 31;
        product2.isAvailable = false;
        product2.companyName = "Dell";
        product2.category = "Laptop";
        int finalPrice2 = product2.maxRetailPrice - (product2.maxRetailPrice * product2.discountPercentage / 100);
        if (product2.isAvailable) {
            System.out.println("\n------------------------------------------------------------------------------\n");
            System.out.println("Product Id : " + product2.id);
            System.out.println("Product Name : " + product2.name);
            System.out.println("Product Max Retail Price : " + product2.maxRetailPrice);
            System.out.println("Product Rating : " + product2.rating);
            System.out.println("Product Reviews Count : " + product2.reviewsCount);
            System.out.println("Product Discount Percentage : " + product2.discountPercentage + "%" + "(off)");
            System.out.println("Product Availability : " + product2.isAvailable);
            System.out.println("Product Company Name : " + product2.companyName);
            System.out.println("Product Category : " + product2.category);
            System.out.println("Final Price After Discount : " + finalPrice2);
        }
        System.out.println("\n------------------------------------------------------------------------------\n");
        Product expensive = product;
        if (product1.maxRetailPrice > expensive.maxRetailPrice) {
            expensive = product1;
            System.out.println(expensive.name + " is the most expensive");
        }
        if (product2.maxRetailPrice > expensive.maxRetailPrice) {
            expensive = product2;
            System.out.println(expensive.name + " is the most expensive");
        }
        System.out.println(expensive.name + " is the most expensive ");


    }
}