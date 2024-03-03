package org.example;

public class MultiThread2 extends Thread{

    private String threadName;

    public MultiThread2(String thread)
    {
        this.threadName = thread;
    }

    @Override
    public void run()
    {
        for(int i=6;i<=10;i++)
        {
            System.out.println(threadName+" : "+i);
        }
    }
}
