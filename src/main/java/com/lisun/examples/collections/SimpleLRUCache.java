package com.lisun.examples.collections;

import java.util.LinkedHashMap;

import static java.util.Map.Entry;

/**
 * @author Oleksii.Lisun
 * @since 1/30/14
 * Time: 2:34 PM
 */
public class SimpleLRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public SimpleLRUCache(int capacity) {
        super(capacity + 1, 1.1f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Entry<K, V> eldest) {
        return this.size() > capacity;
    }
}
