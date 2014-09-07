package com.lisun.examples.collections;

import java.util.*;

/**
 * @author Oleksii.Lisun
 * @since 1/30/14
 * Time: 11:13 AM
 */
public class CollectionsPractice {
    public static void main(String[] args) {

        Person person = new Person();


        TreeMap<Person, String> map2 = new TreeMap<>();

        map2.put(person, "dfdf");


        System.out.println(map2);

        Set<Integer> hashSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(1);
        System.out.println(hashSet);

        NavigableSet<Integer> sortedSet = new TreeSet<>();

        for (int i = 1; i <= 10; i++) {
            sortedSet.add(i);
        }

        System.out.println(sortedSet);
        System.out.println(getNextElement(9, sortedSet));
        System.out.println(getPreviousSet(9, sortedSet));


        Map<Integer, String> map = new LinkedHashMap<>(5, 1, true);
        map.put(5, "a");
        map.put(4, "b");
        map.put(3, "c");
        map.put(2, "d");
        map.put(1, "e");

        map.get(3);
        map.get(5);
        map.get(1);

        System.out.println(map);

        Map<Integer, String> cache = new SimpleLRUCache<>(2);

        cache.put(1, "a");
        cache.put(2, "b");
        cache.put(3, "c");

        cache.get(2);

        cache.put(9, "d");

        System.out.println(cache);
    }

    public static Integer getNextElement(Integer element, NavigableSet<Integer> set) {
        if (element >= set.size()) {
            throw new IllegalArgumentException("Element must be less than size");
        }

        return set.higher(element);

        /*Iterator iterator = set.iterator();
        Integer result = null;

        while (iterator.hasNext()) {
            int next = (int) iterator.next();
            if ((element) == next) {
                result = (int) iterator.next();
                break;
            }
        }
        return result;
    }*/
    }


    public static Set<Integer> getPreviousSet(Integer element, NavigableSet<Integer> set) {
        if (element > set.size()) throw new IllegalArgumentException();

        return set.headSet(element);
    }


}