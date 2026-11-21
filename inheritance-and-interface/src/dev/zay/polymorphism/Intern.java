package dev.zay.polymorphism;

public class Intern extends Employee{
    Intern(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is inter now");
    }
}
