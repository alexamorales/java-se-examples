package com.lisun.examples.generics2;

/**
 * Created by alekseylisun.
 *
 * @since 02.12.15
 */
public class Util {

    public static <K, V> boolean compare(Pair<K, V> first, Pair<K, V> second) {
        return first.getKey().equals(second.getKey()) &&
                first.getValue().equals(second.getValue());
    }
}
