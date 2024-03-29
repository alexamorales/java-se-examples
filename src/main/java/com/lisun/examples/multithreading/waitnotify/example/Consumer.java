package com.lisun.examples.multithreading.waitnotify.example;

import java.util.Random;

/**
 * @author Alex
 * @since 27.12.2014
 */
public class Consumer implements Runnable {
    private Drop drop;

    public Consumer(Drop drop) {
        this.drop = drop;
    }

    @Override
    public void run() {
        Random random = new Random();

        for (String message = drop.take();
             !message.equals("DONE");
             message = drop.take()) {
            System.out.format("Message received: %s%n", message);
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
