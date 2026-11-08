package dev.zay.basic;

public class LoopsExample {
    static void main() {
        /*
            for (initialization; termination; increment) {
                statement
            }
         */

        int [] taskPriority = {5, 4, 3, 2, 1};
        for (int priority : taskPriority) {
            if (priority == 3){
                IO.println("Do task 3");
                break;
            }
            IO.println("Task: " + priority);
        }

        for (int priority : taskPriority) {
            if (priority == 3){
                IO.println("Do task 3");
                continue;
            }
            IO.println("Task: " + priority);
        }


        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < number.length; i++) {
            switch (number[i]) {
                case 1: IO.println("Do is today");
                    break;
            }
        }

        String[] tasks = {"Write README", "Fix login bug", "Deploy"};
        for (String task : tasks) {
            if ("Deploy".equals(task)) {
                System.out.println("Task: " + task);
            }else{
                IO.println("Do nothing");
            }
        }

        /*
            while (expression) {
                statement
             }
         */
        int count = 1;
        while (count < 11) {
            IO.println("Count is: " + count);
            count++;
        }

        /*
            do {
                statement
            } while (expression)
         */

        int counter = 1;
        do {
             IO.println("Counter is: " + counter);
             counter++;
        } while (counter < 5);
    }
}
