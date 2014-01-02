package com.lisun.examples;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksii.Lisun
 * Date: 10/23/13
 * Time: 5:51 PM
 */
public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }


    public static Object dffd(ArrayList<? super Integer> o){
        o.add(34);
        return o;
    }

    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<String, Integer>("String", 1);
        Pair<String, Integer> pair2 = new Pair<String, Integer>("String", 2);

        boolean result = Generic.compare(pair1, pair2);

        Box<Integer> box = new Box<Integer>();

        box.setT(2);

        byte[] bytes = new byte[10];
        bytes[0] = 1;
        String[] strings = new String[10];
        strings[0] = "1";

        String[] strings1 = new String[10];
        strings1[0] = "1";

        Map<byte[], Integer> map = new HashMap<byte[], Integer>();



        System.out.println(map.get(strings1));

        System.out.println(Arrays.hashCode(strings) == Arrays.hashCode(strings1));

        dffd(new ArrayList<Integer>());




    }

}
