package com.lisun.examples.multithreading.waitnotify;

/**
 * @author Aleksey
 * @since 1/29/14
 */
public class Notifier implements Runnable {
    private final Message message;

    public Notifier(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            synchronized (message) {
                String name = Thread.currentThread().getName();
                System.out.println(name + " started");
                message.setMessage(name + " notifier work done");
                message.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
