package com.java.oop.encapsulation.p1;

public class B {
    public static void main(String[] args) {
        A a;
        a = new A();
        a.a = -100;
        int price = 100;
        a.setDiscountPercentage(100);
        System.out.println(price - (price * a.getDiscountPercentage() / 100));
        System.out.println(a.a);
    }
}
