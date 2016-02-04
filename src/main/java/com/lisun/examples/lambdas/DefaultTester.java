package com.lisun.examples.lambdas;

/**
 * Created by alekseylisun.
 *
 * @since 25.01.16
 */
public class DefaultTester implements Formula, Formula2 {
    @Override
    public double calculate(int a) {
        return 0;
    }

    @Override
    public double sqrt(int a) {
        return Formula.super.sqrt(a) ;
    }
}
