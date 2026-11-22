package dev.zay.inheritance.composition;

public class Main {
    static void main() {

        House house = new House(); // House has-a room

        house.addRoom("Bedroom");
        house.addRoom("Kitchen");
        house.addRoom("Living Room");

        house.showRooms();
    }
}
