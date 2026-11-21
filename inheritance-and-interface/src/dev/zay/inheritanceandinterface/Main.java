package dev.zay.inheritanceandinterface;

public class Main {

    static void main() {
        Employee employee = new Employee("Zay", 30000);
        Manager manager = new Manager("Ethan", 50000, 5);


        employee.work();
        manager.work(); // overridden
        System.out.println(manager.getName()); // inherited
        manager.work(); // new
    }
}
