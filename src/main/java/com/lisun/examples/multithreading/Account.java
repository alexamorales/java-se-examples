package com.lisun.examples.multithreading;

/**
 * @author Oleksii.Lisun
 * @since 1/3/14
 *        Time: 6:19 PM
 */
public class Account {
    private int balance = 50;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}
