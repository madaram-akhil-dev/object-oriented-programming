package com.java.oop.inheritance;

public class Customer {
    int id;
    String name;
    long mobileNumber;
    String email;
    String address;

    public Customer(int id, String name, long mobileNumber, String email, String address) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
    }
    void displayCustomerDetails(){
        System.out.println(" Customer Id: " + id);
        System.out.println(" Customer Name: " + name );
        System.out.println(" Mobile Number: " + mobileNumber);
        System.out.println(" Email: " + email);
        System.out.println(" Address: " + address);
    }
}


