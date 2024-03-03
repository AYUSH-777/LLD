package org.example;

import java.util.concurrent.CompletableFuture;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Async {
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

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            // some long running task
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello";
        });

        System.out.println("Doing something else while waiting for the async task to complete...");

        completableFuture.thenAccept(result -> {
            System.out.println(result + " World!");
        });

        System.out.println("Continuing with the main thread...");
    }
}