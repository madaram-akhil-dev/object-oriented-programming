package com.java.oop.abstraction;

public class Attender {
    int id;
    int money;
    String name;
    Mro mro;

    Attender(int id,String name, int money, Mro mro){
        this.id = id;
        this.money = money;
        this.name = name;
        this.mro = mro;
    }
    Certificate processCertificate(ApplicationForm form){
        if(money > 500 ){
            return mro.generateCertificate(form);
        } else {
            return null;
        }
    }
}
