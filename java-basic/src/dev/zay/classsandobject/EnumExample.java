package dev.zay.classsandobject;

public class EnumExample {
    static void main() {

        Task readme = new Task("Create readme", 2, "Red", TaskStatus.TODO);
        System.out.println(readme.title + " status = " + readme.status);

        Task bug = new Task("Fix login bug", 1, "Red", TaskStatus.IN_PROGRESS);
        System.out.println(bug.title + " status = " + bug.status);
        bug.markDone();
        System.out.println(bug.title + " is done? " + bug.done);

        bug.status = TaskStatus.DONE;
        bug.markDone();
        System.out.println(bug.title + " is done? " + bug.done);

    }
}
