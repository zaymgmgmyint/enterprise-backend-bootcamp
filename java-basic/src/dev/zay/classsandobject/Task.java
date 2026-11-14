package dev.zay.classsandobject;

public class Task {
    String title;
    int priority;
    String colorTag;
    boolean done;
    TaskStatus status;

    // default constructor
    Task() {}

    Task(String title, int priority){
        this.title = title;
        this.priority = priority;
    }

    Task (String title) {
        this.title = title;
        this.priority = 3;
    }

    Task (String title, int priority, String colorTag) {

        if (colorTag == null || colorTag.isBlank()) {
            throw new IllegalArgumentException("Color tag is required");
        }

        this.title = title;
        this.priority = priority;
    }

    Task (String  title, int priority, String colorTag, TaskStatus status) {
        this.title = title;
        this.priority = priority;
        this.colorTag = colorTag;
        this.status = status;
    }

    void markDone() {
        if (TaskStatus.DONE == this.status) {
            done = true;
        }
    }
}
