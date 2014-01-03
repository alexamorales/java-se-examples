package com.lisun.examples.generics;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksii.Lisun
 * Date: 10/23/13
 * Time: 5:48 PM
 */
public class Generic {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

}
