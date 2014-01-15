package com.lisun.examples.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Oleksii.Lisun
 * @since 1/15/14
 *        Time: 5:22 PM
 */
public class CollectionsProcessing {
    public static void main(String[] args) {

        final Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Apple", "Tasty");
        hashMap.put("Peach", "Bad");


        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();

        while (iterator.hasNext()) {
            final Map.Entry<String, String> entry = iterator.next();
            if ((entry.getKey().startsWith("A"))) {
                iterator.remove();
            }
        }

        System.out.println(hashMap);

    }
}
