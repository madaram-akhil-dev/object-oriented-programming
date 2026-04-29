package com.java.oop.inheritance;

public class RegularCustomer extends Customer {
    String membership;
    int shippingCharges;

    public RegularCustomer(int id, String name, long mobileNumber, String email, String address, String membership, int shippingCharges) {
        super(id, name, mobileNumber, email, address);
        this.membership = membership;
        this.shippingCharges = shippingCharges;
    }
    int calculateFinalPrice(int maxRetailPrice){
        int priceAfterDiscount = maxRetailPrice - (maxRetailPrice*10/100);
        int finalPrice = priceAfterDiscount + shippingCharges;
        return finalPrice;
    }
    void displayRegularCustomerDetails(){
        System.out.println(" Membership: " + membership);
        System.out.println(" Shipping Charges: " +shippingCharges);
    }
}
