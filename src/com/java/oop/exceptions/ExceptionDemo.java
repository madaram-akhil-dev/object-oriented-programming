package com.java.oop.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. ArithmeticException & InputMismatchException
        try {
            System.out.print("Enter value of a: ");
            int a = scanner.nextInt();

            System.out.print("Enter value of b: ");
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
            System.out.println("Message: " + e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter valid integers only.");
        }

        // 2. NullPointerException
        try {
            String name = null;
            System.out.println(name.length());

        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Object reference is null.");
            System.out.println("Message: " + e.getMessage());
        }

        // 3. ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid array index.");
            System.out.println("Message: " + e.getMessage());
        }

        // 4. NumberFormatException
        try {
            String age = "twenty";
            int parsedAge = Integer.parseInt(age);
            System.out.println(parsedAge);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid number format.");
            System.out.println("Message: " + e.getMessage());
        }

        // 5. FileNotFoundException (Checked Exception)
        try {
            File file = new File("sample.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: File does not exist.");
            System.out.println("Message: " + e.getMessage());
        }

        // 6. Generic Exception Catch
        try {
            String value = null;
            System.out.println(value.toUpperCase());

        } catch (Exception e) {
            System.out.println("Generic Exception Caught.");
            System.out.println("Message: " + e.getMessage());
        }

        scanner.close();

        System.out.println("\nProgram execution completed successfully.");
    }
}