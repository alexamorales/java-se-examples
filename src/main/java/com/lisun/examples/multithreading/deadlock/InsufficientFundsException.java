package com.lisun.examples.multithreading.deadlock;

/**
 * @author Aleksey
 * @since 1/26/14
 */
public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException() {
        super("Account has negative balance");
    }
}
