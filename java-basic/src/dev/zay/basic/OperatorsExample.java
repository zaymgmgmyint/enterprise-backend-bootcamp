package dev.zay.basic;

public class OperatorsExample {

    public static void main(String[] args) {

        int tasks = 7;
        int people = 2;
        int result = tasks * people;
        System.out.println("Add : " + result);
        System.out.println("tasks / people = " + (tasks / people)); // 3: int division drops decimals
        System.out.println("tasks % people = " + (tasks % people)); // 1: the remainder
        System.out.println("7 is even? " + (tasks % 2 == 0));

        int done = 2;
        System.out.println("done++ = " +  done++); // add 1 after
        System.out.println("done = " + done);

        System.out.println("++done = " + ++done);

        String title = "  README     ";
        System.out.println("String : " + title.concat("!"));
        System.out.println("String : " + title.trim());
        String name = "";
        boolean isNameBlank = name.isBlank();
        System.out.println("Name : " + isNameBlank);

    }
}
