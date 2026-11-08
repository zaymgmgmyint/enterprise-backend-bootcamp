package dev.zay.basic;

public class TypeCastingExplained {
    static void main() {
        /*
            byte - 8 bits : -128 to 127
            short - 16 bits : -32,768 to 32,767
            int - 16 bits : -2,147,483,648 to 2,147,483,647
            long - 64 bits : -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            float - 32 bits : 6 to 7 decimal digits
            double - 64 bits : 15 to 16 decimal digits
            char - 16 bits
            boolean - true or false
         */

        // Widening : small to big
        int smallNum = 100;
        long bigNum = smallNum; // java auto casting
        System.out.println("bigNum : " + bigNum);

        // Narrowing : big to small
        int bigNum1 = 100;
        byte smallNum1 = (byte) bigNum1; // nothing lose because it's can storable data range
        System.out.println("smallNum1: " + smallNum1);

        // Narrowing :  data lose
        byte smallNum2 = 127;
        int bigNum2 = 257; // binary format (32 bits) -> 00000000 00000000 00000001 00000001
        smallNum2 = (byte) bigNum2; // binary format (8 bits) -> 00000001
        System.out.println("smallNum2 : " + smallNum2);

        double price = 20.75;
        int salePrice = (int) price;
        System.out.println("salePrice : " + salePrice);

        double price1 = 9.99;
        int salePrice1 = (int) price1; // removed the decimal point, not round
        System.out.println("Result : " + salePrice1);
    }
}
