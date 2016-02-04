package com.lisun.examples.lambdas;

/**
 * Created by alekseylisun.
 *
 * @since 25.01.16
 */
public interface Formula2 {
    default double sqrt (int a) {
        return Math.sqrt(a + 100);
    }
}
