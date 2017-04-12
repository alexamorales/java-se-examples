package com.lisun.examples.sorting;

/**
 * @author Alex
 * @since 11.12.2014
 */
public class InsertionSort implements Sort {
    @Override
    public void sort(int[] source) {
        for (int i = 1; i < source.length; i++) {
            int j = i;
            while (j > 0 && source[j] < source[j - 1]) {
                SortHelper.swap(j, --j, source);
            }
        }
    }
}
