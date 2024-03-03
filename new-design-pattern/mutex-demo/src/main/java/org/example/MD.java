package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MD {
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
        Mutex mutex = new Mutex();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Thread thread1 = new Thread(){
            @Override
            public void run()
            {
                for (int i=0;i<100;i++)
                {
                    mutex.increment();
                }
            }
        };

        Thread thread2 = new Thread(){
          @Override
          public void run()
          {
              for (int i=0;i<100;i++)
              {
                  mutex.decrement();
              }
          }
        };

//        thread1.run();
//        thread2.run();

        executorService.submit(thread1);
        executorService.submit(thread2);


        try {
//            thread1.join();
//            thread2.join();
            executorService.shutdown();
        }
        catch (Exception e)
        {
            System.out.println("Exception Caught : "+e.getMessage());
        }

        System.out.println("Final Value of counter : "+mutex.getCounter());
    }
}