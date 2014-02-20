package com.lisun.examples.generics.container;

/**
 * @author Aleksey
 * @since 2/5/14
 */
public class Container<T extends Product & Comparable<T>> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
