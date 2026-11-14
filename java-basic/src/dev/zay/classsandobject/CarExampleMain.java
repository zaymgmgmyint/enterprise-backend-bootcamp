package dev.zay.classsandobject;

public class CarExampleMain {

    static void main() {

        Car car = new Car();
        car.brand = "Toyota";
        car.color = "Red";
        car.setEngineCode("X1");
        System.out.println("Car engine code : " + car.getEngineCode());

        car.accelerate(10);
        System.out.println("Car is driving speed " + car.speed);

    }
}
