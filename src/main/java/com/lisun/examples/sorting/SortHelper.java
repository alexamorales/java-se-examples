package com.lisun.examples.sorting;

/**
 * @author Alex
 * @since 11.12.2014
 */
public class SortHelper {

    private SortHelper() {
    }

    public static void swap(int indexOne, int indexTwo, int[] arr) {
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }
}
