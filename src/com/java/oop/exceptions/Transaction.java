package com.java.oop.exceptions;

import java.util.Scanner;

public class Transaction {
    public static void main(String[] args) {
        int availableBalance = 10000;
        String name = "Akhil Madaram";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Amount:");
        int amount = scanner.nextInt();
        /*if(performTransaction(availableBalance, amount)){
            printTransaction(name, amount);
        }*/
        try {
            if (performTransaction(availableBalance, amount)) {
                printTransaction(name, amount);

            }
        } catch (InsufficientFundsException e) {
            //handling exception
            System.out.println(e.getMessage());
        }
    }


    private static void printTransaction(String name, int amount) {
        System.out.println("Transaction details: " + name + " " + amount);
    }

    private static boolean performTransaction(int availableBalance, int amount) throws InsufficientFundsException {
        if (amount > availableBalance) {
            throw new InsufficientFundsException("Insufficent Funds, max withdrawal amount is: " + availableBalance);
        } else {
            System.out.println("Transaction successful");
            availableBalance -= amount;
        }
        return true;
    }
}
