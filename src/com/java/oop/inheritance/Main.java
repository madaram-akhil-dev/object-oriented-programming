package com.java.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        RegularCustomer regularCustomer = new RegularCustomer(1, "Akhil", 9866476371L, "akhil@gmail.com", "Hno: 1-2/3 abc colony, Hyderabad", "Silver", 50);
        PremiumCustomer premiumCustomer = new PremiumCustomer(2, "Madhu", 9989510897L, "madhu@gmail.com", "flat no: 102, abc colony, HYD", "Gold", 0);
        Product product = new Product(1, "Asus Vivobook", 69599, 4.5f, 1200, (byte) 10, true, "Asus", "Laptop");
        int regularPrice = regularCustomer.calculateFinalPrice(product.maxRetailPrice);
        int premiumPrice = premiumCustomer.calculateFinalPrice(product.maxRetailPrice);
        product.displayProductDetails();
        System.out.println("\n-------------------------------------------------------------------------------------------------\n");
        regularCustomer.displayCustomerDetails();
        regularCustomer.displayRegularCustomerDetails();
        System.out.println(" Final Price: " + regularPrice);
        System.out.println("\n-------------------------------------------------------------------------------------------------\n");
        premiumCustomer.displayCustomerDetails();
        premiumCustomer.displayPremiumCustomerDetails();
        System.out.println(" Final Price: " + premiumPrice);
        System.out.println("\n-------------------------------------------------------------------------------------------------\n");


    }
}