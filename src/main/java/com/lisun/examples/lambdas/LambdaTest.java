package com.lisun.examples.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * @author Oleksii.Lisun
 * @since 4/3/2014
 * Time: 8:11 PM
 */
public class LambdaTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "maria", "mike", "hanna");

        names.stream().forEach(a -> a.charAt(1));

        Collections.sort(names, (a, b) -> a.compareTo(b));

        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);

        Converter<String, Integer> converterWithMethodReference = Integer::valueOf;

        System.out.println(converter.convert("23"));

        Converter<Integer, String> lambda = a -> String.valueOf(a);

        System.out.println(lambda.convert(34));

        final Runnable runnable;
        runnable = () -> {
            System.out.println("lamda");
        };

        new Thread(runnable).start();


        Predicate<Integer> predicate = (p) -> p > 0;
        predicate.test(2); // true
        predicate.negate().test(34); //false

        Predicate<Object> nonNull = Objects::nonNull;

        System.out.println(nonNull.test(predicate));




    }
}
