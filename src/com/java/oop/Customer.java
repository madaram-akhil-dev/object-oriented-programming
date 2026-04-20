package com.java.oop;

public class Customer {
        int id;
        String name;
        byte age;
        String gender;
        long mobileNumber;
        String email;
        String address;
        //no arg Constructor
        Customer(){
                System.out.println("Customer Constructor Called");
                id = 112;
                name = "Ram";
                age = 25;
                gender = "male";
                mobileNumber = 8989858744L;
                email = "Ram@gmail.com";
                address = "Flat no: 123, kukatpally, Hyderabad ";

        }
        //arg constructor

        public Customer(int id, String name, byte age,String gender, long mobileNumber, String email, String address) {
                this.id = id;
                this.name = name;
                this.age = age;
                this.gender = gender;
                this.mobileNumber = mobileNumber;
                this.email = email;
                this.address = address;
        }
}
