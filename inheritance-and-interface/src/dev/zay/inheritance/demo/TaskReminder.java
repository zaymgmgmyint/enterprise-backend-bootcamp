package dev.zay.inheritance.demo;

public class TaskReminder {

    private final Notifier notifier; // depends on the interface

    TaskReminder(Notifier notifier) { // passed in, not created here
        this.notifier = notifier;
    }

    void remind(String to, String taskTitle) {
        notifier.send(to, "Reminder: " + taskTitle);
    }

/*
    private final EmailNotifier emailNotifier;
    private final SmsNotifier smsNotifier;

    TaskReminder(EmailNotifier emailNotifier, SmsNotifier smsNotifier) { // passed in, not created here
        this.emailNotifier = emailNotifier;
        this.smsNotifier = smsNotifier;
    }

    void reminder (String to, String taskTitle, boolean isEmail){
       if (isEmail) {
           emailNotifier.send(to, "Reminder: " + taskTitle);
       }else {
           smsNotifier.send(to, "Reminder: " + taskTitle);
       }

    }*/
}
