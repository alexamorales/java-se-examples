package com.lisun.examples.multithreading.deadlock;

/**
 * @author Aleksey
 * @since 1/26/14
 */
public class Deadlock2 {

    static void transfer(Account acc1, Account acc2, int amount) {
        if (acc1.getBalance() < 0) {
            throw new InsufficientFundsException();
        }
        synchronized (acc1) {
            System.out.println("In 1st synchronized block: " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (acc2) {
                System.out.println("In 2nd synchronized block: " + Thread.currentThread().getName());
                acc1.withdraw(amount);
                acc2.deposit(amount);
            }
        }
    }

    public static void main(String[] args) {

        final Account acc1 = new Account(1000);
        final Account acc2 = new Account(500);

        new Thread(new Runnable() {
            @Override
            public void run() {
                transfer(acc2, acc1, 1000);
            }
        }).start();

        transfer(acc2, acc1, 500);
    }
}

class Account {
    int balance;

    public int getBalance() {
        return balance;
    }

    Account(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) {
        balance -= amount;
        System.out.println(balance + " :after withdraw");
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println(balance + " after deposit");
    }

}
