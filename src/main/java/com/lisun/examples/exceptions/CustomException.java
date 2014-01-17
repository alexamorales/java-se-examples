package com.lisun.examples.exceptions;

/**
 * @author Oleksii.Lisun
 * @since 1/17/14
 *        Time: 12:20 PM
 */
public class CustomException extends Exception {
    int reason;

    public CustomException(int reason) {
        this.reason = reason;
    }

    public CustomException(String message, int reason) {
        super(message);
        this.reason = reason;
    }
}
