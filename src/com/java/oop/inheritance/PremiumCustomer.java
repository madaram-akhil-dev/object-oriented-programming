package com.java.oop.inheritance;

public class PremiumCustomer extends Customer{
    String membership;
    int shippingCharges;

    public PremiumCustomer(int id, String name, long mobileNumber, String email, String address, String membership, int shippingCharge) {
        super(id, name, mobileNumber, email, address);
        this.membership = membership;
        this.shippingCharges = shippingCharge;
    }
    int calculateFinalPrice(int maxRetailPrice){
        int priceAfterDiscount = maxRetailPrice - (maxRetailPrice * 10/100);
        int finalPrice = priceAfterDiscount - (priceAfterDiscount * 20/100);
        return finalPrice + shippingCharges;

    }
    void displayPremiumCustomerDetails(){
        System.out.println(" Membership: " + membership );
        System.out.println(" Shipping charges: " + shippingCharges);
    }
}
