package com.java.oop.inheritance;

public class PremiumCustomer extends Customer{
     String membershipLevel;

    public PremiumCustomer(int id, String name, long mobileNumber, String email, String address, String membership, int shippingCharges, String membershipLevel) {
        super(id, name, mobileNumber, email, address, membership, shippingCharges);
        this.membershipLevel = membershipLevel;
    }

    int calculateFinalPrice(int maxRetailPrice){
        int priceAfterDiscount = maxRetailPrice - (maxRetailPrice * 10/100);
        int finalPrice = priceAfterDiscount - (priceAfterDiscount * 20/100);
        return finalPrice + shippingCharges;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println(" Membership Level: " + membershipLevel);
    }
}
