package org.example;

public class MultiThread extends Thread{

    private String threadName;
    public MultiThread(String name)
    {
        this.threadName = name;
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
