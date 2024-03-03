package org.lld;

import org.lld.observable.IphoneObservable;
import org.lld.observable.StockObservable;
import org.lld.observer.EmailObserver;
import org.lld.observer.MobileObserver;
import org.lld.observer.NotificationObserver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        StockObservable iphoneObservable = new IphoneObservable();
        NotificationObserver obj1 = new EmailObserver("ayushwinner@gmail.com");
        NotificationObserver obj2 = new MobileObserver("8800519214");
        iphoneObservable.add(obj1);
        iphoneObservable.add(obj2);
        iphoneObservable.setStock(10);
    }
}