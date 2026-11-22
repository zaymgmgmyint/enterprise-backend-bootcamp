package dev.zay.inheritance.demo;

public class NotifyDemo {

    static void main() {

        TaskReminder byEmail = new TaskReminder(new EmailNotifier());
        TaskReminder bySms = new TaskReminder(new SmsNotifier());

        byEmail.remind("mai", "Write README");
        bySms.remind("aye", "Fix login bug");

       /* TaskReminder taskReminder = new TaskReminder(new EmailNotifier(), new SmsNotifier());

        taskReminder.reminder("mail", "Write README", true);
        taskReminder.reminder("aye", "Fix login bug", false);*/

    }
}
