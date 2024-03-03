package org.example;

public class MultiThread1 implements Runnable{

    private String threadName;
    public MultiThread1(String threadName)
    {
        this.threadName = threadName;
    }

    @Override
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(threadName+" : "+i);
        }
    }
}
