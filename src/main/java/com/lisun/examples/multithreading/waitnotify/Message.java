package com.lisun.examples.multithreading.waitnotify;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Aleksey
 * @since 1/29/14
 */
public class Message {
    private String message;

    private ReentrantLock lock = new ReentrantLock();

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ReentrantLock getLock() {
        return lock;
    }
}
