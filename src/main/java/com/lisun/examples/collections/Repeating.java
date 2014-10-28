package com.lisun.examples.collections;

import com.lisun.examples.oop.Dog;

import java.util.*;

/**
 * Created by oleksii.lisun on 27-Oct-14.
 */
public class Repeating {

    private static SortedSet<Integer> sortedSet = new TreeSet<>();


    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<Integer>((o1, o2) -> 0);

        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(1);

        System.out.println(treeSet);

        sortedSet.add(5);
        sortedSet.add(1);
        sortedSet.add(6);
        sortedSet.add(2);

        System.out.println(getNextElem(6));
        System.out.println(getPrevElems(6));

        Dog dog = new Dog();

        Map<Dog, String> weakHashMap = new WeakHashMap<>();
        weakHashMap.put(dog, "1");

        dog = null;
        Runtime.getRuntime().gc();

        for (int i = 0; i < 1000; i++) {
            if (weakHashMap.isEmpty()) {
                System.out.println("Map is empty");
                break;
            } else {
                System.out.println("Map is full");
            }
        }


        Deque<Integer> deque = new LinkedList<>();


    }

    public static void removeKeysStartinA(Map<String, Integer> map) {


    }

    public static Integer getNextElem(int elem) {
        Iterator<Integer> iterator = sortedSet.iterator();
        Integer result = null;

        while (iterator.hasNext()) {
            int next = iterator.next();
            if (next == elem && iterator.hasNext()) {
                result = iterator.next();
                break;
            }
        }
        return result;
    }

    public static Set<Integer> getPrevElems(Integer elem) {
        return sortedSet.headSet(elem);
    }

}
