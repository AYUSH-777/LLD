package org.example;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PCM {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        ExecutorService executor = Executors.newFixedThreadPool(4);

        List<Callable<Integer>> tasks = new ArrayList<>();

//        for (int i = 0; i < 10; i++) {
//            final int taskNumber = i;
//            Callable<Integer> task = () -> {
//                Thread.sleep(1000);
//                System.out.println("Task " + taskNumber + " completed by thread " + Thread.currentThread().getName());
//                return taskNumber;
//            };
//            tasks.add(task);
//        }
//
//        List<Future<Integer>> results = executor.invokeAll(tasks);
//
//        for (Future<Integer> result : results) {
//            System.out.println("Result of task " + result.get() + " is available.");
//        }

        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++)
                {
                    System.out.println("Task 1 : "+Thread.currentThread().getName());
                }
            }
        };

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++)
                {
                    System.out.println("Task 2 : "+Thread.currentThread().getName());
                }
            }
        };

        executor.submit(task1);
        executor.submit(task2);

        executor.shutdown();
    }
}