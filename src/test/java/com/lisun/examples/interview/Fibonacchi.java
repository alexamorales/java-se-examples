package com.lisun.examples.interview;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Oleksii.Lisun
 * @since 1/6/14
 *        Time: 3:24 PM
 */
public class Fibonacchi {

    @Test
    public void shouldReturnNthFibonacciNumber() {
        //Given
        //When
        long actual = FibonacciNumbers.fibonacci(6);
        long expected = 8;
        //Then
        Assert.assertEquals("5th Fibonacci number", actual, expected);
    }
}
