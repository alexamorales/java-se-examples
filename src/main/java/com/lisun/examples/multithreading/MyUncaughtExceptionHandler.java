package com.lisun.examples.multithreading;

/**
 * @author Oleksii.Lisun
 * @since 1/15/14
 *        Time: 4:29 PM
 */
public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t.getName() + "Exception: " + e.getMessage());

    }
}
