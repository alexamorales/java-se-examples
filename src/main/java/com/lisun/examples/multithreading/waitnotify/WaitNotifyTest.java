package com.lisun.examples.multithreading.waitnotify;

/**
 * @author Aleksey
 * @since 1/29/14
 */
public class WaitNotifyTest {
    public static void main(String[] args) {
        Message message = new Message("process it");

        Waiter waiter = new Waiter(message);
        new Thread(waiter, "Waiter").start();


        Waiter waiter1 = new Waiter(message);
        new Thread(waiter1, "Waiter1").start();

        Notifier notifier = new Notifier(message);
        new Thread(notifier, "First notifier ").start();

        System.out.println("All threads are started");
    }
}
