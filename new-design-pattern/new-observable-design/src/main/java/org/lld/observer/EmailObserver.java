package org.lld.observer;

import org.lld.observable.StockObservable;

public class EmailObserver implements NotificationObserver{
    private final StockObservable obj;
    private final String email;

    public EmailObserver(StockObservable obj, String email)
    {
        this.obj = obj;
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("Sent on Email : "+email);
    }
}
