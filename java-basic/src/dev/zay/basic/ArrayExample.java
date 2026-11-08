package dev.zay.basic;

public class ArrayExample {
    static void main() {
        /*
            int [] numberArray;
            int [] numberArray = new int [5];
            int [] numberArray = {1, 2, 3, 4, 5};
         */

        int[] numArr = {1, 2, 3, 4, 5};
        System.out.println("Array Length: " + numArr.length);

        System.out.println("Array: " + numArr[4]);
        numArr[2] = 10;
        System.out.println("Array: " + numArr[2]);

        String[] tasks = new String[2];
        tasks[0] = "Write README";
        tasks[1] = "Deploy";

        System.out.println("Task: " + tasks[0]);
        System.out.println("Task: " + tasks[1]);

        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "}, // - 0
                {"Ethan", "Rose"} // - 1
        };

        System.out.println(names[0][2] + names[1][1]);

    }
}
