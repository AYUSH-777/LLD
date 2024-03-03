package org.lld;

//public class DaemonThread extends Thread{
//    @Override
//    public void run()
//    {
//        System.out.println("Running Daemon Block");
//        System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().isDaemon());
//    }
//}



public class DaemonThread extends Thread {
    public DaemonThread(String name) {
        super(name);
    }

    public void run() {
        // Checking whether the thread is Daemon or not
        if (Thread.currentThread().isDaemon()) {
            System.out.println(getName() + " is Daemon thread");
        } else {
            System.out.println(getName() + " is User thread");
        }
    }
}
