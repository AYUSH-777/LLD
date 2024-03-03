package org.lld.observable;

import org.lld.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{
    public List<NotificationObserver> observerList = new ArrayList<>();
    public int stockVal = 0;

    @Override
    public void add(NotificationObserver obj) {
        observerList.add(obj);
    }

    @Override
    public void remove(NotificationObserver obj) {
       observerList.remove(obj);
    }

    @Override
    public void notifySubscribers() {
     for(NotificationObserver obj:observerList)
     {
         obj.update();
     }
    }

    @Override
    public void setStockCount(int stockCount) {
        if(stockVal==0)
        {
            notifySubscribers();
        }
        stockVal = stockCount;
    }

    @Override
    public int getStockCount() {
        return stockVal;
    }
}
