package com.java.oop.encapsulation.p1;

public class A {

    protected int a;
    private float discountPercentage = 5;

    public A() {

    }
    void m1() {

    }

    public static void main(String[] args) {
        A a;
        a = new A();
        System.out.println(a.a);
    }

    public void setDiscountPercentage(float discountPercentage) {
        if (discountPercentage > 0 && discountPercentage <= 10)
            this.discountPercentage = discountPercentage;
    }

    public float getDiscountPercentage() {
        return discountPercentage;
    }
}
