public class DecisionDemo {

    static void main(String[] args) {
        int priority = 1;

        if (priority == 1) {
            System.out.println("Do it today");
        } else if (priority == 2) {
            System.out.println("Do it this week");
        } else {
            System.out.println("Do it when you can");
        }

        boolean done = false;
        String label = done ? "DONE" : "TODO"; // a short choice between two values
        System.out.println("label = " + label);

        for (int p = 1; p <= 3; p++) {
            System.out.println(p + " -> " + priorityLabel(p));
        }

    }

    static String priorityLabel(int priority) {
        return switch (priority) {
            case 1 -> "HIGHT";
            case 2 -> "MEDIUM";
            default -> "LOW";
        };
    }
}
