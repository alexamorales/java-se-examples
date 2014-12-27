package com.lisun.examples.multithreading.waitnotify;

/**
 * @author Aleksey
 * @since 1/29/14
 */
public class WaitNotifyTest {
    public static void main(String[] args) {
        Message message = new Message("Process this message");

        new Thread(new Waiter(message)).start();
        new Thread(new Notifier(message)).start();


    }
}
