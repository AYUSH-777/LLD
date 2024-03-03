package org.lld.observer;

import org.lld.observable.StockObservable;

public class MobileObserver implements NotificationObserver{
//    private final StockObservable obj;
    private final String mobile;

    public MobileObserver(String mobile) {
//        this.obj = obj;
        this.mobile = mobile;
    }

    @Override
    public void updateAll() {
        System.out.println("Sent on Mobile : "+mobile);
    }
}
