package com.lisun.examples.multithreading.deadlock;

import com.lisun.examples.multithreading.exceptions.InsufficientFundsException;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author Oleksii.Lisun
 * @since 1/28/14
 * Time: 4:07 PM
 */
public class Transfer implements Callable<Boolean> {

    public static final int WAIT_SEC = 3;
    private Account accountFrom;
    private Account accountTo;
    private int amount;
    private int id;
    private CountDownLatch startLatch;

    public Transfer(Account accountFrom, Account accountTo, int amount, int id, CountDownLatch startLatch) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.amount = amount;
        this.id = id;
        this.startLatch = startLatch;

    }

    @Override
    public Boolean call() throws InsufficientFundsException, InterruptedException {
        System.out.println("Waiting to start");
        startLatch.await();
        if (accountFrom.getLock().tryLock(WAIT_SEC, TimeUnit.SECONDS)) {
            System.out.println("Start transfer with id: " + id);
            try {
                if (accountFrom.getBalance() < amount) {
                    throw new InsufficientFundsException();
                }
                if (accountTo.getLock().tryLock(WAIT_SEC, TimeUnit.SECONDS)) {
                    try {
                        accountFrom.withdraw(amount);
                        accountTo.deposit(amount);
                        Thread.sleep(new Random().nextInt(5000));
                    } finally {
                        accountTo.getLock().unlock();
                    }
                } else {
                    accountFrom.incrementFailTransferCounter();
                    accountTo.incrementFailTransferCounter();
                    return false;
                }
            } finally {
                accountFrom.getLock().unlock();
            }
            return true;
        } else {
            accountFrom.incrementFailTransferCounter();
            accountTo.incrementFailTransferCounter();
            return false;
        }
    }

}