package com.lisun.examples.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Oleksii.Lisun
 * @since 2/5/14
 * Time: 6:24 PM
 */
public class Practice {
    public static void main(String[] args) {
        List raw = new ArrayList();
        List<String> list = new ArrayList<>();

        List<String> listString = Arrays.asList("string");
        raw = list;


        SomeType<?> rawType = new SomeType();
        rawType.test(listString);


    }
}
