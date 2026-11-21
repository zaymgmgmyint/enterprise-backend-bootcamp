package dev.zay.polymorphism;

public class Main {

    static void main() {
        Employee [] staff = {
                new Employee("Zay"),
                new Manager("Ethan"),
                new Developer("Rose"),
                new Intern("MgMg")
        };



        for (Employee employee : staff) {
            employee.work();
        }

        Employee boss = staff [1]; // Manager
        if (boss instanceof Manager manager) {
            manager.approvedLeave("Zay");
        }

    }
}
