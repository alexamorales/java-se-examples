package com.lisun.examples.lambdas;

/**
 * @author Oleksii.Lisun
 * @since 4/3/2014
 * Time: 8:05 PM
 */
public interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
