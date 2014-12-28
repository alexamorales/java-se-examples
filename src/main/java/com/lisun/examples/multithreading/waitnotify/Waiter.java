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
        synchronized (message) {
            try {
                System.out.println(name + " waiting to get notified at time: " + (int) ((System.currentTimeMillis() / 1000) % 60));
                message.wait();
            } catch (InterruptedException e) {
                System.out.println(name + " waiter thread got notified at time: " + (int) ((System.currentTimeMillis() / 1000) % 60));
            }
            System.out.println(name + " processed: " + message.getMessage());
        }
    }
}

