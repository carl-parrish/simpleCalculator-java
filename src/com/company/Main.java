package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var scanner = new Scanner(System.in);
        System.out.print("Enter a numeric value: ");
        double num1 = 0;
        try {
            num1 = scanner.nextDouble();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print("Enter a numeric value ");
        double num2 = 0;
        try {
            num2 = scanner.nextDouble();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print("Choose an operator (+ - * / % ) ");
        char operator  = '@'; //place holder
        try {
            operator = scanner.next().charAt(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        double answer = 0;

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
