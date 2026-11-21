package dev.zay.polymorphism;

public class Manager extends Employee{

    Manager(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is leading the team");
    }

    void approvedLeave(String employeeName) {
        System.out.println(name + " is approved leave of " + employeeName);
    }
}
