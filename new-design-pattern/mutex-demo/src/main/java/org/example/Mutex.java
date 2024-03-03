package org.example;

public class Mutex {
    private int counter;

    public Mutex()
    {
        counter = 0;
    }

    public synchronized void increment()
    {
        counter++;
    }

    public synchronized void decrement()
    {
        counter--;
    }

//    public void increment()
//    {
//        counter++;
//    }
//
//    public void decrement()
//    {
//        counter--;
//    }


    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
