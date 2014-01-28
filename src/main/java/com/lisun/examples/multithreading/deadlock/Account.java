package com.lisun.examples.multithreading.deadlock;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Oleksii.Lisun
 * @since 1/28/14
 * Time: 4:03 PM
 */
class Account {

    public static final int INITIAL_VALUE = 0;

    int balance;

    private Lock lock;

    private AtomicInteger failCounter = new AtomicInteger(INITIAL_VALUE);

    Account(int balance) {
        this.balance = balance;
        lock = new ReentrantLock();
    }

    public Lock getLock() {
        return lock;
    }

    public int getBalance() {
        return balance;
    }

    public AtomicInteger getFailCounter() {
        return failCounter;
    }

    public void incrementFailTransferCounter() {
        failCounter.incrementAndGet();
    }

    public void withdraw(int amount) {
        balance -= amount;
        System.out.println(balance + " :after withdraw");
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println(balance + " :after deposit");
    }

}
