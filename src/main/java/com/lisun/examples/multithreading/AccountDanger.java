package com.lisun.examples.multithreading;

/**
 * @author Oleksii.Lisun
 * @since 1/6/14
 *        Time: 11:47 AM
 */
public class AccountDanger implements Runnable {
    private Account account = new Account();

    public static void main(String[] args) {
        final AccountDanger accountDanger = new AccountDanger();
        final Thread one = new Thread(accountDanger);
        final Thread two = new Thread(accountDanger);

        one.setName("Fred");
        two.setName("Lucy");

        one.start();
        two.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            makeWithdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("account is overdrawn");
            }
        }
    }

    /*
    * <p>Make withdrawal from bank account</p>
    *
    * @param amount of withdrawal sum
    * */
    private synchronized void makeWithdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw");

            try {
                Thread.sleep(500);
            } catch (InterruptedException ignored) {
            }
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal");

        } else {
            System.out.println("Not enough in account for " +
                    Thread.currentThread().getName() + " to withdraw " + account.getBalance());
        }
    }
}
