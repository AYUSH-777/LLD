package org.lld.service;

import org.lld.Notification;

public class SmsNotification implements Notification {
    private String message;

    public SmsNotification(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sendMessage()
    {
        System.out.println("SMS sent : "+message);
    }
}
