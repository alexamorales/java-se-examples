package com.lisun.examples.lambdas;

/**
 * @author Oleksii.Lisun
 * @since 4/3/2014
 * Time: 8:07 PM
 */
public class DefaultMethodTest {

    public static void main(String[] args) {
        final Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };
        System.out.println(formula.sqrt(2));

    }


}
