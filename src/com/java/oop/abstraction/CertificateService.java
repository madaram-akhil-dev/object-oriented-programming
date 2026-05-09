package com.java.oop.abstraction;

public interface CertificateService {
    String USERNAME = "admin" ;
    String PASSWORD =  "admin@123";



   /* CertificateService(String username, String password){
        this.username = username;
        this.password = password;
    }*/

    Certificate getCertificate(ApplicationForm applicationForm);
    default boolean authenticate(String username, String password){
        if(username.equals("admin") && password.equals("admin@123"))
            return true;
        else
            return false;
    }
}
