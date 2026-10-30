public class TypeExample {

    public static void main(String[] args) {

        // Primitive Data Types
        int number = 1;
        double price = 10.9;
        char grade = 'A';
        boolean isJavaFun = true;

        System.out.println("number = " + number);

        // Non-Primitive Data Types
        String greeting = "Hello";
        int [] numbers =  {1, 2, 3, 4, 5};

        // Non-Primitive data type are Object
        int greetLength = greeting.length();
        System.out.println(greetLength);

        int roleNo = 1;
        System.out.println("++RoleNo = "+ ++roleNo);
        roleNo = 1;
        System.out.println("roleNo++ = "+ roleNo++);
    }
}
