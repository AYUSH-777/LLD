package org.lld.observer;

import org.lld.observable.StockObservable;

public class EmailObserver implements NotificationObserver{
//    private final StockObservable obj;
    private final String email;

    public EmailObserver( String email) {
//        this.obj = obj;
        this.email = email;
    }

    @Override
    public void updateAll() {
        System.out.println("Email sent to : "+ email);
    }
}
