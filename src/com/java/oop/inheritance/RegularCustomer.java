package com.java.oop.inheritance;

public class RegularCustomer extends Customer {
    int loyaltyPoints;

    public RegularCustomer(int id, String name, long mobileNumber, String email, String address, String membership, int shippingCharges, int loyaltyPoints) {
        super(id, name, mobileNumber, email, address, membership, shippingCharges);
        this.loyaltyPoints = loyaltyPoints;
    }

    int calculateFinalPrice(int maxRetailPrice){
        int priceAfterDiscount = maxRetailPrice - (maxRetailPrice*10/100);
        return priceAfterDiscount + shippingCharges;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println(" Loyalty Points: " + loyaltyPoints);
    }
}
