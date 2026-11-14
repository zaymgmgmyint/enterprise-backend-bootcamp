package dev.zay.classsandobject;

public class CarObjectExample {
    // know something's (data, properties, field)
    String brand;
    String color;
    int speed;

    // does something (method)
    public void start (){
        System.out.println("Car is start...");
    }

    public void stop () {
        System.out.println("Car is stop");
    }

    public void accelerate (int amount) {
        speed += amount;
    }

    public void reduce (int amount) {
        speed -= amount;
    }

    public void showInfo() {
        System.out.println(color + " " + brand + " going " + speed + " km/h");
    }

}
