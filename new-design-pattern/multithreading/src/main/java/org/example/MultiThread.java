package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MultiThread {
    public static void main(String[] args) {
//        Thread thread1 = new Multithreading("thread 1");
//
//        Thread thread2 = new Multithreading("thread 2");
//
//        thread1.start();
//        thread2.start();

        Runnable thread3 = new Multi();
        thread3.run();
    }
}