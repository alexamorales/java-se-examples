package com.lisun.examples.collections;

import java.util.*;

/**
 * @author Alex
 * @since 23.10.2014
 */
public class TypicalCollectionsOperations {
    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>(16);
        hashSet.add(5);
        hashSet.add(56);
        hashSet.add(2);
        hashSet.add(43);
        hashSet.add(null);

        System.out.println(hashSet);

        Integer[] arr = {3, 5, 6, 9, 2, 7};
        List<Integer> arrayList = Arrays.asList(arr);

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(arrayList.getClass());
        System.out.println(Arrays.binarySearch(arr, 3));

        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(4);
        integerTreeSet.add(8);
        integerTreeSet.add(1);


        LinkedList<Integer> linkedIntegers = new LinkedList<>();

        linkedIntegers.add(1);
        linkedIntegers.add(2);
        linkedIntegers.add(3);
        linkedIntegers.add(89);
        linkedIntegers.remove(2);

        System.out.println(linkedIntegers.get(2));

        Iterator linkedListIterator = linkedIntegers.descendingIterator();

        HashCode hashCode = new HashCode();

        System.out.println(hashCode.hashCode());

        Map<HashCode, String> hashCodeStringHashMap = new HashMap<>();

        hashCodeStringHashMap.put(hashCode, "aa");

        hashCode.a = 2;

        System.out.println(hashCode.hashCode());

        hashCodeStringHashMap.put(hashCode, "bb");

        hashCodeStringHashMap.values().forEach(e -> System.out.println(("********\n" + e + "\n*********")));

        System.out.println(hashCodeStringHashMap.get(hashCode));

        int[] ints = new int[2];

        System.out.println(ints.hashCode());

        ints[0] = 2;

        System.out.println(ints.hashCode());


    }
}
