package com.lisun.examples.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey
 * @since 2/5/14
 */
public class Practice {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("String");

        SomeType<Integer> someType = new SomeType<>();
        someType.test(stringList);
    }
}
