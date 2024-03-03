package org.lld;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ThreadMain {
    public static void main(String[] args) {
//          Thread multithreading = new Multithreading();
//          multithreading.start();

//          Runnable obj = new MultiThread();
//          Thread tObj = new Thread(obj);
//          tObj.start();

//          Thread dObj = new DaemonThread();
//          dObj.setDaemon(true);
//          dObj.start();

        DaemonThread t1 = new DaemonThread("t1");
        DaemonThread t2 = new DaemonThread("t2");
        DaemonThread t3 = new DaemonThread("t3");
        // Setting user thread t1 to Daemon
        t1.setDaemon(true);
        // starting first 2 threads
        t1.start();
        t2.start();
        // Setting user thread t3 to Daemon
        t3.setDaemon(true);
        t3.start();
    }
}