package dev.zay.classandobject.examples;

public class ToStringExample {
    static void main() {

        Car car = new Car("Toyota", "Red");
        System.out.println(car); // class name & memory code
        // updateName("Honda", car);
        System.out.println(car); // class name & memory code

    }

    private static void updateName(String brand, Car car) {
        car.brand = brand;
    }

    static class Car {
        private String brand;
        private String color;

        public Car (String brand, String color) {
            this.brand = brand;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Car{brand= " + brand + ", " + "color= " + color + "}";
        }
    }
}
