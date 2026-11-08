package dev.zay.basic;

public class DecisionExample {

    static void main(String[] args) {

        /*
        if (hour < 9) {
           All good
        } else if (hour > 9 && hour < 9:30) {
            Warning
        } else if (hour > 10) {
            Fine
        } else (hour > 8) {
            Award
        }

        if (day = 7) {
            Holiday
          } else {
            Working Day
          }

          condition ? "" : ""
          (day = 3) ? "Holiday" : "Working Day"

         */

        int priority = 4;

        if (priority == 1) {
            System.out.println("Do it today");
        } else if (priority == 2){
            System.out.println("Do it tomorrow");
        } else if (priority == 3) {
            System.out.println("Do it this week");
        } else {
            System.out.println("Do it when you can");
        }

        int currentAmount = -1;
        if (currentAmount > 0){
            System.out.println("Withdraw!");
        } else {
            System.out.println("Decline!");
        }

        // condition ? execute 1 : execute 2
        System.out.println((currentAmount > 0) ? "Withdraw!" : "Decline!");
    }

}
