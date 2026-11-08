package dev.zay.basic;

import java.util.Scanner;

public class SimpleCalculator {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Java Scanner Calculator ===");

        // Get the first number
        System.out.println("Enter the first number");
        double num1 = scanner.nextDouble();

        // Get the mathematical operator (+, -, *, /)
        System.out.println("Enter an operator (+, - , *, /)");
        String operator = scanner.next();

        // Get the second number
        System.out.println("Enter the second number");
        double num2 = scanner.nextDouble();

        double result = 0;
        // Perform calculation based on the operator
        if ("+".equals(operator)){
            result = num1 + num2;
        } else if ("-".equals(operator)) {

        } else if ("*".equals(operator)) {

        } else if ("/".equals(operator)) {

        }

        // TODO try with switch

        System.out.println("\nResult: " + result);

        scanner.close();
    }
}
