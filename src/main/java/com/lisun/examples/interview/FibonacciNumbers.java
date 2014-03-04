package com.lisun.examples.interview;

/**
 * @author Oleksii.Lisun
 * @since 1/6/14
 *        Time: 2:29 PM
 */
public class FibonacciNumbers {

    private static int cache[] = new int[1000];

    public long sum(int n) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += cache[i];
        }
        return sum;
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (cache[n] != 0) {  //search if the value was calculated before
            return cache[n];
        }
        cache[n] = fibonacci(n - 1) + fibonacci(n - 2); //cache value
        return cache[n];   // return cached value
    }
}
