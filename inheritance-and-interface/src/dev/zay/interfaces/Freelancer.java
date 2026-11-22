package dev.zay.interfaces;

public class Freelancer implements Payable, Workable{

    private int hours;
    private double rate;

    Freelancer(int hours, double rate) {
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double calculatePay() {
        return hours * rate;
    }

    @Override
    public int getTax() {
        return 10;
    }

    @Override
    public void work() {
        System.out.println("Work when he/she free");
    }
}
