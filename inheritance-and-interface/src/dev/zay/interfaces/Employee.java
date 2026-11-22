package dev.zay.interfaces;

public class Employee implements Payable, Workable{

    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary;
    }

    @Override
    public int getTax() {
        return 8;
    }

    @Override
    public void work() {
        System.out.println("Work 8 hours");
    }
}
