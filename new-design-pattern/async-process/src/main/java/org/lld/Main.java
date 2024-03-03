package org.lld;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        for(int i=0;i<5;i++)
//        {
//            final int taskId = i;
//            executorService.submit(()->processTask(taskId));
//        }
//
//        executorService.shutdown();
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i=0;i<5;i++)
        {
            final int taskId = i;
            executorService.submit(()->processTask(taskId));
        }
        executorService.shutdown();
    }

    public static void processTask(int taskId)
    {
        try{
            Thread.sleep(2000);
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
        System.out.println("Task completed by thread : "+Thread.currentThread().getName());
    }

//    public static void processTask(int taskId)
//    {
//        try {
//            Thread.sleep(2000);
//        }
//        catch (Exception e)
//        {
//            System.out.println("Exception Caught : "+e.toString());
//        }
//        System.out.println("Task : "+taskId+" completed by thread : "+Thread.currentThread().getName());
//    }
}