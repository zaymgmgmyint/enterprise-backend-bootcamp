package dev.zay.inheritanceandinterface;

public class Employee {
    private String name;
    protected double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    String getName() { return name; }

    void work() {
        System.out.println(name + " is working");
    }
}
