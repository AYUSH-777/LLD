package org.lld.observer;

import org.lld.observable.StockObservable;

public class MobileObserver implements NotificationObserver{
    private final StockObservable obj;
    private final String mobile;


    public MobileObserver(StockObservable obj, String mobile) {
        this.obj = obj;
        this.mobile = mobile;
    }

    @Override
    public void update() {
        System.out.println("Sent on Mobile Number : "+mobile);
    }
}
