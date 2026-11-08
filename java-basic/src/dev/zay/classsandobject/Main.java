package dev.zay.classsandobject;

public class Main {

    static void main() {
        Car car1 = new Car();
        car1.brand = "Honda";
        car1.color = "Red";
        car1.speed = 30;
        car1.showInfo();
        car1.accelerate(10);
        car1.showInfo();
        car1.reduce(5);
        car1.showInfo();

        Car car2 = new Car();
        car2.brand = "Toyota";
        car2.color = "Blue";
        car2.speed = 25;
        car2.showInfo();
    }

}
