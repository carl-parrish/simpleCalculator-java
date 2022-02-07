package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here

        //declare & initialize vars
        double num1, num2, answer;
        num1 = num2 = answer = 0;

        char operator  = '@'; //place holder

        var scanner = new Scanner(System.in);


        try {
            System.out.print("Enter a numeric value: ");
            num1 = scanner.nextDouble();
            scanner.nextLine();
        } catch (InputMismatchException e) { e.printStackTrace(); }

        try {
            System.out.print("Enter a numeric value ");
            num2 = scanner.nextDouble();
            scanner.nextLine();
        } catch (InputMismatchException e) { e.printStackTrace(); }
        System.out.print("Choose an operator (+ - * / % ) ");

        try {
            operator = scanner.next().charAt(0);
        } catch (Exception e) { e.printStackTrace(); }

        switch (operator) {
            case '+' -> answer = num1 + num2;
            case '-' -> answer = num1 - num2;
            case '*' -> answer = num1 * num2;
            case '/' -> answer = num1 / num2;
            case '%' -> answer = num1 % num2;
            default -> System.out.println("Invalid operator entered! ");
        }
        System.out.println("The answer is " + answer);
    }
}