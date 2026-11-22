package dev.zay.classandobject.examples;

import dev.zay.classandobject.util.CommonUtils;
import dev.zay.classandobject.util.DateUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class StaticExample {
    static void main() {
        Car car1 = new Car("Toyata");
        Car car2 = new Car("Honda");
        Car car3 = new Car("BMW");

        Car.add(1 , 2);
        System.out.println("Result : " + Math.addExact(2, 3));

        System.out.println("Total cars: " + Car.totalCars);
        System.out.println("Current cars: " + car3.currentCarCount);

        System.out.println(CommonUtils.isEmpty(""));
        System.out.println(CommonUtils.isEmpty("Zay"));

        DateUtils.isAfterPayDay(new Date("01/04/2026"));

        System.out.println("Now: " + LocalDateTime.now());
    }

    static class Car {
        String brand;
        int currentCarCount = 0;
        static int totalCars = 0;

        public Car(String brand) {
            this.brand = brand;
            totalCars++; // counts every car ever created
            currentCarCount++;
        }

        static int add (int a, int b) {
            return a + b;
        }
    }

}
