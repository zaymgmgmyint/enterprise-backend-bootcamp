package dev.zay.basic;

public class TypeExample {

    public static void main(String[] args) {

        // whole number -> byte, short, int, long
        // decimal -> float, double
        // one char -> char
        // true / false -> boolean

        // Primitive Data Types
        byte byteNum = 2; // 1 byte
        short shortNum = 33; // 2 byte
        int studentNumber = 2; // 4 byte
        long longNum = 100_100_100_100_100L; // 8 byte
        System.out.println("Int : " + studentNumber);

        float studentPoint = 1.0f; // 4 byte
        double studentGrade = 5.5; // 8 bte

        char word = 'A'; // 2 byte, UNICODE

        boolean isSuccess = false;

        // Non-Primitive Data Types
        String greeting = "Hello";
        System.out.println("Greeting : " + greeting);

        // Non-Primitive data type is Object
        int greetingLength = greeting.length();
        System.out.println("Greeting : " + greetingLength);
    }
}
