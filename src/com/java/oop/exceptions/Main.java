package com.java.oop.exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            try {

                System.out.println("Enter a number : ");
                int number1 = scanner.nextInt();
                System.out.println("Enter another number : ");
                int number2 = scanner.nextInt();
                System.out.println(number1 / number2);
                System.out.println("hello");
            } catch(ArithmeticException e) {
                System.out.println("Enter valid number (other than zero)");
                input();
            }
            try {
                int size = scanner.nextInt();
                int[] ids = new int[5];
                ids[30] = 100;
            } catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
                System.out.println("some issue in array");
                input();
            }
            try {
                String username = getUserName();
                System.out.println(username.equals("Akhil"));
            } catch(NullPointerException e) {
                System.out.println("null pointer exception");
                input();
            }
        } /*catch(ArithmeticException e) {
            System.out.println("Enter valid number (other than zero)");
            input();
        } catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException e){
            System.out.println("some issue in array");
            input();
        }  catch(NullPointerException e){
            System.out.println("null pointer exception");
            input();
        }*/ catch(ArithmeticException e){
            System.out.println("some internal error occurred. Please try again later");
            System.out.println("Reason : " + e.getMessage() );
            input();
        }
    }

    private static void input() {
        System.out.println("input continues");
    }

    private static String getUserName() {
        String username  = null;
        //code to get this from user
        return username;
    }
}
