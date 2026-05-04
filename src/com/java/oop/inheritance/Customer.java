package com.java.oop.inheritance;

public class Customer {
    int id;
    String name;
    long mobileNumber;
    String email;
    String address;
    String membership;
    int shippingCharges;

    public Customer(int id, String name, long mobileNumber, String email, String address, String membership, int shippingCharges) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
        this.membership = membership;
        this.shippingCharges = shippingCharges;
    }

    public void displayDetails(){
        System.out.println(" Customer Id: " + id);
        System.out.println(" Customer Name: " + name );
        System.out.println(" Mobile Number: " + mobileNumber);
        System.out.println(" Email: " + email);
        System.out.println(" Address: " + address);
        System.out.println(" Membership: " +membership);
        System.out.println(" Shipping Charges: " + shippingCharges);
    }
}


