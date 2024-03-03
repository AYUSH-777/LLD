package org.lld.observable;

import org.lld.observer.NotificationObserver;

public interface StockObservable {
    void add(NotificationObserver obj);
    void update();
    void setStock(int stockCount);
}
