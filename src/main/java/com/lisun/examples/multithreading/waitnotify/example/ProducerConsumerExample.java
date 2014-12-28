package com.lisun.examples.multithreading.waitnotify.example;

/**
 * @author Alex
 * @since 27.12.2014
 */
public class ProducerConsumerExample {
    public static void main(String[] args) {
        Drop drop = new Drop();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement : stackTraceElements) {
            System.out.format("Stack trace elements: %s%n", stackTraceElement);
        }
        (new Thread(new Producer(drop))).start();
        (new Thread(new Consumer(drop))).start();
    }
}
