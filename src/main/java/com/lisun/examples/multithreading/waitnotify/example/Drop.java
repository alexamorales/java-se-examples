package com.lisun.examples.multithreading.waitnotify.example;

/**
 * @author Alex
 * @since 27.12.2014
 */
public class Drop {
    // Message sent from producer
    // to consumer.
    private String message;
    // True if consumer should wait
    // for producer to send message,
    // false if producer should wait for
    // consumer to retrieve message.
    private boolean empty = true;

    public String take() {
        // Wait until message is
        // available.
        synchronized (this) {
            while (empty) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            empty = true;
            // Notify producer that
            // status has changed.
            notifyAll();
            return message;
        }
    }

    public void put(String message) {
        // Wait until message has
        // been retrieved.
        synchronized (this) {
            while (!empty) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            empty = false;
            this.message = message;
            notifyAll();
        }
    }
}
