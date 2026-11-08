package dev.zay.basic;

import java.util.Scanner;

public class ScannerExample {
    static void main(String[] args) {
        // create the scanner object for console input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you name");
        String name = scanner.nextLine();

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println("\n--- Profile ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        // close the scanner
        scanner.close();

    }
}
