package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MT {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Thread t1 = new MultiThread("t1");
        Thread t2 = new MultiThread("t2");
//
//        t1.start();
//        t2.start();
        t1.run();
        t2.run();
    }
}