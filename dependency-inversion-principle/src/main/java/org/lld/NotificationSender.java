package org.lld;

public class NotificationSender {
    private final Notification notification;

    public NotificationSender(Notification notification) {
        this.notification = notification;
    }

    public void sendNotification()
    {
        notification.sendMessage();
    }
}
