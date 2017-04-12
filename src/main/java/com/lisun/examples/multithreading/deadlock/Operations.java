package com.lisun.examples.multithreading.deadlock;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @author Oleksii.Lisun
 * @since 1/28/14
 * Time: 5:42 PM
 */
public class Operations {

    public static final int SIZE = 10;

    public static void main(String[] args) throws InterruptedException {

        final Random random = new Random();

        final Account acc1 = new Account(1000);
        final Account acc2 = new Account(1000);

        CountDownLatch countDownLatch = new CountDownLatch(1);
        ScheduledExecutorService exe = Executors.newScheduledThreadPool(1);
        exe.scheduleAtFixedRate(() ->
                System.out.println("Number of fails: " + acc1.getFailCounter()), 3, 1, TimeUnit.SECONDS);

        ExecutorService service = Executors.newFixedThreadPool(3);
        final boolean[] arr = new boolean[SIZE];

        for (int i = 0; i < SIZE; i++) {
            Future<Boolean> result = service.submit(
                    new Transfer(acc1, acc2, random.nextInt(400), i, countDownLatch)
            );
            countDownLatch.countDown();
            try {
                arr[i] = result.get();
            } catch (ExecutionException e) {
                System.out.println(e.getCause().getMessage());
            }
        }
        service.shutdown();
        exe.shutdown();

        Arrays.toString(arr);
    }
}
