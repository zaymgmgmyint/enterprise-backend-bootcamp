package dev.zay.abstractclass;

public abstract class Employee {

    protected String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void work(); // abstract method: no body

    void clockIn(){
        System.out.println(name + "clocked in");
    }
}
