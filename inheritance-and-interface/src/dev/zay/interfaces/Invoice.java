package dev.zay.interfaces;

public class Invoice implements Payable, Printable{
    @Override
    public double calculatePay() {
        return 1200;
    }

    @Override
    public void print() {
        System.out.println("Invoice: 1200");
    }

    @Override
    public int getTax() {
        return Payable.super.getTax();
    }
}
