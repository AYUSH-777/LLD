package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TA {
    public static void main(String[] args) throws InterruptedException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Thread thread1 = new Thread(){
            @Override
            public void run()
            {
                for(int i=1;i<=5;i++)
                {
                    System.out.println("Thread 1 : "+i);
                }
            }
        };

        Thread thread2 = new Thread(){
            @Override
            public void run()
            {
                for(int i=6;i<=10;i++)
                {
                    System.out.println("Thread 2 : "+i);
                }
            }
        };

//        thread1.start();
//        thread2.start();
//
//        thread1.join();
//        thread2.join();
        executorService.submit(thread1);
        executorService.submit(thread2);
        executorService.shutdown();
        System.out.println("Main thread execution got completed");
    }
}