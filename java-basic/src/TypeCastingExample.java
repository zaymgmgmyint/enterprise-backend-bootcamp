public class TypeCastingExample {
    static void main() {
        byte b = 127;
        int a = 257;

        // A byte has 8 bits (range -128 to 127).
        // Casting an int to byte keeps only the lowest 8 bits.
        // 257 = 1 0000 0001, so the result is 0000 0001 = 1 (257 % 256)
        b = (byte) a;

        System.out.println("Value of b after casting: " + b);

        // 128 = 1000 0000. The first bit is the sign bit, so it wraps to -128.
        System.out.println("(byte) 128 = " + (byte) 128);

        // 300 % 256 = 44
        System.out.println("(byte) 300 = " + (byte) 300);

        // double to int cuts off the decimal part. It does not round.
        double price = 9.99;
        int priceInt = (int) price;
        System.out.println("(int) 9.99 = " + priceInt);
    }
}
