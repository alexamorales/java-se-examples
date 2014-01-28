package com.lisun.examples.multithreading.deadlock;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Oleksii.Lisun
 * @since 1/28/14
 * Time: 5:42 PM
 */
public class Operations {
    public static void main(String[] args) throws InterruptedException {

        final Random random = new Random();

        final Account acc1 = new Account(1000);
        final Account acc2 = new Account(1000);

        ExecutorService service = Executors.newFixedThreadPool(3);
        final boolean[] arr = new boolean[10];

        for (int i = 0; i < 10; i++) {
            Future<Boolean> result = service.submit(
                    new Transfer(acc1, acc2, random.nextInt(400), i)
            );
            try {
                arr[i] = result.get();
            } catch (ExecutionException e) {
                System.out.println(e.getCause().getMessage());
            }
        }

        service.shutdown();


    }
}
