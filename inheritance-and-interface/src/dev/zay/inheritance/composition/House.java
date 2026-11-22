package dev.zay.inheritance.composition;

import java.util.ArrayList;
import java.util.List;

// House class
public class House {

    // Nested Room class
    private class Room {
        private String roomName;

        // Constructor
        Room(String roomName) {
            this.roomName = roomName;
        }

        void displayRoom() {
            System.out.println("Room " + roomName);
        }
    }

    private List<Room> rooms = new ArrayList<>();

    // to add rooms
    public void addRoom(String roomName) {
        rooms.add(new Room(roomName));
    }

    // to display rooms
    public void showRooms() {
        for (Room room : rooms) {
            room.displayRoom();
        }
    }
}
