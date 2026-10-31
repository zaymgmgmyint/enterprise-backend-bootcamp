/**
 * Shows type casting from a big type to a small type.
 *
 * <p>Trade-off:
 * <ul>
 *   <li>Pro: Lets you use a smaller type or keep only the whole number.</li>
 *   <li>Con: Data can be lost: overflow (byte) or cut decimals (int).</li>
 *   <li>Con: Java gives no warning, so check that the value fits first.</li>
 * </ul>
 */
public class TypeCastingExample {
    static void main() {

        int priority = 2;
        long bigger = priority; // widening: automatic

        long biggestScore = 5000000000000000000l;
        int smallestScore = (int) biggestScore; // narrowing: the cast cuts off the value
//        System.out.println("Smallest Score : " + smallestScore);



        byte b = 127;
        int a = 257;

        // A byte has 8 bits (range -128 to 127).
        // Casting an int to byte keeps only the lowest 8 bits.
        b = (byte) a;

        System.out.println("Value of b after casting: " + b);

        // double to int cuts off the decimal part. It does not round.
        double price = 9.99;
        int priceInt = (int) price;
        System.out.println("(int) 9.99 = " + priceInt);
    }
}
