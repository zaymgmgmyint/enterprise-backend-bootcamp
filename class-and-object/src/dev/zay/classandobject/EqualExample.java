package dev.zay.classandobject;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EqualExample {
    static void main() {

        Car toyota1 = new Car("Toyota", "1111");
        Car toyota2 = new Car("Toyota", "2222");

        System.out.println(toyota1 == toyota2); // false: tow difference objects
        System.out.println(toyota1.equals(toyota2)); // false too, by default

        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2); // false: difference object
        System.out.println(s1.equals(s2)); // true: same text

        Set<Car> cars = new HashSet<>();
        cars.add(new Car("Toyota", "11"));
        cars.add(new Car("Toyota", "11"));
        System.out.println(cars.size()); // 2 instead of 1. the duplicate wasn't detected


    }

    static class Car {
        private String brand;
        private String vin;

        public Car(String brand, String vin) {
            this.brand = brand;
            this.vin = vin;
        }

        // To compare object by their data, not their memory address
        @Override
        public boolean equals(Object obj) {
            Car other = (Car) obj;
            if (brand.equals(other.brand) && vin.equals(other.vin)) {
                return true;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(brand, vin); // use the same fields as equals()
        }

    }
}
