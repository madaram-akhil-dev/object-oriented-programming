package com.java.oop.inheritance;

import com.java.oop.polymorphism.CustomerService;

public class Main {
    public static void main(String[] args) {

        CustomerService service = new CustomerService();

        Customer regular = new RegularCustomer(1,"Akhil",9866476371L,"akhil@gmail.com","Hno:12-6-2/103,KP,HYD","Silver",50,100);
        Customer premium = new PremiumCustomer(2, "Rahul", 9123456780L, "rahul@gmail.com","flatno: 102,lodha apartments,Hyd","Gold",0,"elite");

        service.displayCustomerDetails(regular);
        System.out.println("------------");
        service.displayCustomerDetails(premium);
    }
}