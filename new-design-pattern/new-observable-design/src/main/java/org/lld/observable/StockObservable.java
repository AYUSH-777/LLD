package org.lld.observable;

import org.lld.observer.NotificationObserver;

public interface StockObservable {
    void add (NotificationObserver obj);
    void remove(NotificationObserver obj);
    void notifySubscribers();
    void setStockCount(int stockCount);
    int getStockCount();
}
