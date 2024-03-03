package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ES {
    public static void main(String[] args) {
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

        Runnable task1 = new Runnable(){
            @Override
            public void run(){
                for(int i=1;i<=5;i++)
                {
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        };

        Runnable task2 = new Runnable(){
          @Override
          public void run()
          {
              for(int i=6;i<=10;i++)
              {
                  System.out.println(Thread.currentThread().getName()+":"+i);
              }
          }
        };

        Runnable task3 = new Runnable(){
            @Override
            public void run()
            {
                for(int i=11;i<=15;i++)
                {
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        };

        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.shutdown();
    }
}