package com.lisun.examples.lambdas;

/**
 * @author Oleksii.Lisun
 * @since 4/4/2014
 * Time: 1:32 PM
 */
@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
