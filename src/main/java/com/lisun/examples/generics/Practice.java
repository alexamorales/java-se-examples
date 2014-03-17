package com.lisun.examples.generics;


import com.lisun.examples.generics.container.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oleksii.Lisun
 * @since 2/5/14
 * Time: 6:24 PM
 */
public class Practice {
    public static void main(String[] args) {
        List raw = new ArrayList();
        List<Product> list = new ArrayList<>();

        List<Product> listString = new ArrayList<>();
        raw = list;


        SomeType<?> rawType = new SomeType();
        rawType.test(listString);

        Practice.copy();
    }

    public static <T> void copy(List<? extends T> src, List<? super T> dest) {
        for (T product : src) {
            dest.add(product);
        }
    }
}
