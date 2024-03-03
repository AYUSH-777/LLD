package org.example;

public class Multithreading extends Thread{
    private String threadName;

    public Multithreading(String threadName)
    {
        this.threadName=threadName;
    }

    @Override
    public void run(){
        for(int i=1;i<=5;i++)
        {
            System.out.println("threadName : "+threadName+" count : "+i);
        }
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }
}
