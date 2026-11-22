package dev.zay.interfaces;

public class Main {

    static void main() {
        Payable [] people = {
                new Employee("Zaw", 30000),
                new Freelancer(20, 500),
                new Invoice()
        };

        double total = 0;
        for (Payable payable : people) {
            total += payable.calculatePay();
            System.out.println("Tax: " + payable.getTax());
        }
        System.out.println("Total pay: " + total);

        Employee employee = new Employee("Zay", 30000);
        System.out.println("Tax: " + employee.getTax());
        employee.work();

        Freelancer freelancer = new Freelancer(20, 100);
        freelancer.work();

    }
}
