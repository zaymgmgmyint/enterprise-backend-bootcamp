package dev.zay.inheritance;

public class Manager extends Employee{

    private int teamSize;

    Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    void work() {
        System.out.println(getName() + " is leading " + teamSize + " people");
    }

    void approveLeave() {
        System.out.println(getName() + " approved the leave");
    }
}
