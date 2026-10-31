public class OperatorsExample {

    public static void main(String[] args) {

        int tasks = 7;
        int people = 2;
        System.out.println("tasks / people = " + (tasks / people)); // 3: int division drops decimals
        System.out.println("tasks % people = " + (tasks % people)); // 1: the remainder
        System.out.println("7 is even? " + (tasks % 2 == 0));

        int done = 2;
        System.out.println("done++ = " +  done++); // add 1 after
        System.out.println("done = " + done);

        System.out.println("++done = " + ++done);

    }
}
