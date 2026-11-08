package dev.zay.basic;

public class SwitchExample {
    static void main() {
        /*
            switch (data) {
                case (condition)
                    statement
                break;
                case (condition)
                    statement
                break;
         */

        int priority = 0;

        switch (priority) {
            case 0:
                System.out.println("Nothing to do");
                break;
            case 1:
                System.out.println("Do it today");
                break;
            case 2:
                System.out.println("Do it later");
                break;
            default:
                System.out.println("No task");
        }
    }
}
