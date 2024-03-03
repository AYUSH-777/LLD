package org.lld;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int sharedVal = 0;
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer> readVal = executorService.submit(()->show());
        Future<Integer> updateVal = executorService.submit(()->update(3));

        int readResult = readVal.get();
        int operateResult = updateVal.get();

        // Print the results
        System.out.println("Read result: " + readResult);
        System.out.println("Operate result: " + operateResult);

        executorService.shutdown();
    }

    public static int show()
    {
        return sharedVal;
    }

    public static int update(int val)
    {
        sharedVal+=val;
        return sharedVal;
    }
}