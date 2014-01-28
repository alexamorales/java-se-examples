package com.lisun.examples.multithreading.deadlock;

import com.lisun.examples.multithreading.exceptions.InsufficientFundsException;

import java.util.concurrent.TimeUnit;

/**
 * @author Aleksey
 * @since 1/26/14
 */
public class Deadlock2 {

    static void transfer(Account acc1, Account acc2, int amount) throws InterruptedException, InsufficientFundsException {

        if (acc1.getBalance() < 0) {
            throw new InsufficientFundsException();
        }
        if (acc1.getLock().tryLock(5, TimeUnit.SECONDS)) {
            try {
                if (acc2.getLock().tryLock(5, TimeUnit.SECONDS)) {
                    try {
                        acc1.withdraw(amount);
                        acc2.deposit(amount);
                    } finally {
                        acc2.getLock().unlock();
                    }
                }
            } finally {
                acc1.getLock().unlock();
            }

        } else {
            acc1.incrementFailTransferCounter();
            acc2.incrementFailTransferCounter();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        final Account acc1 = new Account(1000);
        final Account acc2 = new Account(500);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    transfer(acc2, acc1, 1000);
                } catch (InterruptedException | InsufficientFundsException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        try {
            transfer(acc2, acc1, 500);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }
    }
}

