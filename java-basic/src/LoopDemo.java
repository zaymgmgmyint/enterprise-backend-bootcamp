public class LoopDemo {
    static void main(String[] args) {

        String[] tasks = {"Write README", "Fix login bug", "Deploy"};

        for (int i = 0; i < tasks.length; i++) { // when you know how many times
            System.out.println((i + 1) + ". " + tasks[i]);
        }

        int[] priorities = {2, 1, 3, 4};
        int total = 0;
        for (int priority : priorities) { // enhanced for every item, no index
            total += priority;
        }
        System.out.println("Total priority = " + total);

        int attempts = 0;
        while (attempts < 3) { // when you do not know how many times
            attempts++;
        }
        System.out.println("While ran " + attempts + " times");

        int n = 10;
        do { // runs at least once, even if the test is false
            System.out.println("do-while runs at least once: n = " + n);
            n++;
        } while (n < 5);

        for (int i = 1; i <= 6; i++) {
            if (i == 2) {
                continue; // skip to the next round
            }
            if (i == 5) {
                break; // leave the loop early
            }
            System.out.println("i = " + i);
        }

    }
}
