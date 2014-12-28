package com.lisun.examples.multithreading.waitnotify;

/**
 * @author Aleksey
 * @since 1/29/14
 */
public class Waiter implements Runnable {
    private final Message message;

    public Waiter(Message message) {
        this.message = message;
    }


    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        final long start = System.nanoTime();
        synchronized (message) {

            try {
                System.out.println(name + " waiting to get notified");
                message.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " waiter thread got notified");
            System.out.println(name + " processed: " + message.getMessage());
            final long end = System.nanoTime();

            System.out.println("Took: " + ((end - start) / 1000000) + "ms");
        }
    }
}
