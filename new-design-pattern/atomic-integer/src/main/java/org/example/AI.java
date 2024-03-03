package org.example;

import java.util.concurrent.atomic.AtomicInteger;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class AI {
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

        AtomicInteger atomicInteger = new AtomicInteger(0);

        final int[] counter = {0};
        Thread t1 = new Thread(){
            @Override
            public void run()
            {
                for(int i=0;i<100;i++)
                {
                    atomicInteger.incrementAndGet();
                    counter[0]++;
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run()
            {
                for (int i=0;i<100;i++)
                {
                    atomicInteger.incrementAndGet();
                    counter[0]++;
                }
            }
        };

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Atomic Integer : "+counter[0]);
    }
}