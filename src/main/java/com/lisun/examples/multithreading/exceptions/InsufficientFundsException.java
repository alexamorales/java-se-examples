package com.lisun.examples.multithreading.exceptions;

/**
 * @author Aleksey
 * @since 1/26/14
 */
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Deposit is bigger than amount");
    }
}
