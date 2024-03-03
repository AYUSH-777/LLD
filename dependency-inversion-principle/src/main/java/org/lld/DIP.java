package org.lld;

import org.lld.service.EmailNotification;
import org.lld.service.SmsNotification;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class DIP {
    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification("Gmail Message");
        Notification smsNotification = new SmsNotification("Sms Message");
        NotificationSender emailNotificationSender = new NotificationSender(emailNotification);
        NotificationSender smsNotificationSender = new NotificationSender(smsNotification);
        emailNotificationSender.sendNotification();
        smsNotificationSender.sendNotification();
    }
}