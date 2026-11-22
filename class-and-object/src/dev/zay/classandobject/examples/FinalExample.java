package dev.zay.classandobject.examples;

public class FinalExample {
    static void main() {

        Car honda = new Car("Honda", "222222");

        Car toyota = new Car("Toyota", "111111");
        toyota.brand = "TOYOTA";
        System.out.println(toyota.brand + " vin number is " + toyota.vin);

        toyota.speedUp(100);
        System.out.println(toyota.brand + "driving speed " + toyota.currentSpeed);

        toyota.speedUp(300);
        System.out.println(toyota.brand + "driving speed " + toyota.currentSpeed);

        toyota.speedUp(10);
        System.out.println(toyota.brand + "driving speed " + toyota.currentSpeed);

    }

    static class Car {
        String brand;
        final int maxSapeed = StaticFinalExample.MAX_SPEED;
        int currentSpeed = 0;
        private final String vin; // the car's ID number never changes

        public Car (String brand, String vin) {
            this.brand = brand;
            this.vin = vin;
        }

        void speedUp(int amount){
            if (currentSpeed > StaticFinalExample.MAX_SPEED) {
                throw new IllegalArgumentException("Can't over the max speed 200");
            }
            currentSpeed += amount;
        }
    }
}
