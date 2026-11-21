package dev.zay.abstractclass;

public class Developer extends Employee{

    Developer(String name){
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is writing code");
    }
}
