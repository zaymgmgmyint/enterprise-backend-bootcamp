public class TaskReport {
    static void main(String[] args) {

        String[] tasks = {"Write README", "Fix login bug", "Update docs"};
        int[] priorities = {2, 1, 3, 1};

        int urgentCount = 0;
        for (int i = 0; i < tasks.length; i++) {
            String label = priorityLabel(priorities[i]);
            System.out.println((i + 1) + ". " + tasks[i] + " [" + label + "]");

            if (priorities[i] == 1) {
                urgentCount++;
            }
        }
        System.out.println("Urgent tasks: " + urgentCount);
        System.out.println("Average priority: " + average(priorities));

        printTask("Deploy", 1); // calls the two-parameter version
        printTask("Update docs"); // calls the one-parameter version
    }

    static String priorityLabel(int priority) {
        return switch (priority) {
            case 1 -> "HIGH";
            case 2 -> "MEDIUM";
            default -> "LOW";
        };
    }

    static double average(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return (double) total / values.length;
    }

    static void printTask(String title, int priority) {
        System.out.println(title + " [" + priorityLabel(priority) + "]");
    }

    static void printTask(String title) { // same name, fewer parameters
        printTask(title, 3); // no priority given: use LOW
    }
}
