package dev.zay.basic;

public class MethodExample {
    /*
    // method header
        public static int addNumber (int a, int b) {
        // method body
        int sum = a + b;
        return sum;
        }

        - modifier (public static)
        - return type or void
        - method name
        - parameter or none
        - method body {}
     */

    static void main() {
        int result = add(10 , 5);
        printResult(result);

        System.out.println("is even = " + isEven(5));

        System.out.println(getFullName("Zay", "Myint"));

        printTask("Deploy", 1);
        printTask("Update docs");
    }

    public static void printResult(int result){
        System.out.println("Result = " + result);
    }

    public static int add (int a, int b) {
        return a + b;
    }

    public static boolean isEven (int number){
        return number % 2 == 0;
    }

    public static String getFullName (String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static void sendMail () {
        System.out.println("Sending mail");
        System.out.println("Sending SMS");
        System.out.println("Hijack...");
    }

    public static void printTask(String  title, int priority) {
        System.out.println("[" + title + ", " + priority + "]");
    }

    public static void printTask(String title){
        // System.out.println("[" + title + "," + 3 + "]");
        printTask(title, 3);
    }
}
