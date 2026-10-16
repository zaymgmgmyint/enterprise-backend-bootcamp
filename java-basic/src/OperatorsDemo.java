public class OperatorsDemo {

    public static void main(String[] args) {

        int tasks = 7;
        int people = 2;
        System.out.println("tasks / people = " + (tasks / people)); // 3: int division drops decimals
        System.out.println("tasks % people = " + (tasks % people)); // 1: the remainder
        System.out.println("7 is even? " + (tasks % 2 == 0));

        int done = 0;
        done += 2; // same as done = done + 2
        done++; // add 1
        System.out.println("done = " + done);

        int priority = 1;
        boolean finished = false;
        boolean doToday = priority == 1 && !finished;
        boolean showIt = priority == 1 || priority == 2;

        System.out.println("doToday = " + doToday);
        System.out.println("showIt = " + showIt);
        String title = " Write README ";
        System.out.println("[" + title.strip() + "]");
        System.out.println("length = " + title.strip().length());
        System.out.println("blank? " + " ".isBlank());
        String status = "DONE";
        System.out.println("equals: " + status.equals("DONE")); // compar text with equals, not ==
    }
}
