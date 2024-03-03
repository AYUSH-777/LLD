package org.lld.observable;

import org.lld.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{
    private List<NotificationObserver> list = new ArrayList<>();
    private int stockVal = 0;

    @Override
    public void add(NotificationObserver obj) {
        list.add(obj);
    }

    @Override
    public void update() {
    for(NotificationObserver obj:list)
    {
        obj.updateAll();
    }
    }

    @Override
    public void setStock(int stockCount) {
    if(stockVal==0)
    {
        update();
    }
    stockVal = stockCount;
    }
}
