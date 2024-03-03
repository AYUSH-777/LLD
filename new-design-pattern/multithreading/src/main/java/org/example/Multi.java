package org.example;

public class Multi implements Runnable{
    @Override
    public void run() {
        System.out.println("Running via runnable : "+Thread.currentThread().getName());
    }
}
