package com.lisun.examples.generics2;

import com.lisun.examples.blocks.InitializationBlocks;

/**
 * Created by alekseylisun.
 *
 * @since 02.12.15
 */
public class OrderedPair<K, V> implements Pair<K, V> {

    private K key;

    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {

        Pair<String, Integer> stringIntegerPair = new OrderedPair<>("First", 1);
        Pair<String, Integer> stringIntegerPair2 = new OrderedPair<>("Second", 2);
        Pair<String, Box<Integer>> stringIntegerPair3 = new OrderedPair<>("Second", new Box<>());

        boolean same = Util.<String, Integer>compare(stringIntegerPair, stringIntegerPair2);




    }

}
