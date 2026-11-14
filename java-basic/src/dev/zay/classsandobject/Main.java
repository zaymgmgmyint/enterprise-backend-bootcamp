package dev.zay.classsandobject;

public class Main {

    static void main() {
        CarObjectExample carObjectExample1 = new CarObjectExample();
        carObjectExample1.brand = "Honda";
        carObjectExample1.color = "Red";
        carObjectExample1.speed = 30;
        carObjectExample1.showInfo();
        carObjectExample1.accelerate(10);
        carObjectExample1.showInfo();
        carObjectExample1.reduce(5);
        carObjectExample1.showInfo();

        CarObjectExample carObjectExample2 = new CarObjectExample();
        carObjectExample2.brand = "Toyota";
        carObjectExample2.color = "Blue";
        carObjectExample2.speed = 25;
        carObjectExample2.showInfo();


        Task readme = new Task(); // build an object
        System.out.println(readme.title);
        System.out.println(readme.priority);
        System.out.println(readme.done);

        readme.title = "Write README";
        readme.priority = 2;
        readme.markDone();
        System.out.println(readme.title + " is done? " + readme.done);

        Task copy = readme;
        System.out.println(copy.title + " is done? " + copy.done);

        Task bug = new Task("Fix the login bug", 1);
        System.out.println(bug.title + " is done? " + bug.done);

        Task docUpdate = new Task("Update the doc");
        System.out.println(docUpdate.title + " priority is " + docUpdate.priority);

        Task bugFix = new Task("Fix the dashboard", 1, "Red");


    }

}
