package com.java.oop.arrays;

public class ArrayCodingQuestions2 {

    public static int[] sortAscending(int[] productPrices) {

        for (int i = 0; i < productPrices.length; i++) {
            for (int j = i + 1; j < productPrices.length; j++) {

                if (productPrices[i] > productPrices[j]) {
                    int temp = productPrices[i];
                    productPrices[i] = productPrices[j];
                    productPrices[j] = temp;
                }
            }
        }

        return productPrices;
    }

    public static void main(String[] args) {

        int[] productPrices = {40, 30, 50, 10, 20};

        int[] sorted = sortAscending(productPrices);

        for (int i = 0; i < productPrices.length; i++) {
            System.out.print(productPrices[i] + " ");
        }
    }
}