public class TypeDemo {

    public static void main(String[] args) {
        int priority = 2;
        long bigger = priority;

        double hours = 2.7;
        int wholeHours = (int) hours;

        int total = 7;
        double average = (double) total / 2;

        int fromText = Integer.parseInt("42");
        String toText = String.valueOf(42);

        boolean isUrgent = priority == 1;
        long big = 3_000_000_000L;

        System.out.println("bigger = " + bigger);
        System.out.println("wholeHours = " + wholeHours);
        System.out.println("average = " + average);
        System.out.println("fromText + 1 = " + (fromText + 1));
        System.out.println("toText plus an exclamation mark = " + toText + "!");
        System.out.println("isUrgent = " + isUrgent);
        System.out.println("big = " + big);
        System.out.println("(byte) 257 = " + (byte) 257);
    }
}
