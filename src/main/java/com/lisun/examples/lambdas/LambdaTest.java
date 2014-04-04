package com.lisun.examples.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Oleksii.Lisun
 * @since 4/3/2014
 * Time: 8:11 PM
 */
public class LambdaTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "maria", "mike", "hanna");

        Collections.sort(names, (a, b) -> a.compareTo(b));


    }
}
