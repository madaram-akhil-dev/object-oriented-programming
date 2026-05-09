package com.java.oop.abstraction;

public class Mro {
    int id;
    String name;
    int money;

    Mro(int id, String name, int money){
        this.id = id;
        this.name = name;
        this.money = money;
    }

    Certificate generateCertificate(ApplicationForm form){
        Certificate certificate = null;
        if(money > 500){
            certificate = new Certificate(1, "Birth Certificate ", "Madhu Samala",form.customer.name, "2026-05-04");

        }
        return certificate;
    }
}
