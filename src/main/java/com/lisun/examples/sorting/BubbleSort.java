package com.lisun.examples.sorting;

import static com.lisun.examples.sorting.Sort.*;

/**
 * @author Alex
 * @since 30.10.2014
 */
public class BubbleSort implements Sort {
    @Override
    public void sort(int[] source) {
        for (int i = source.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (source[j] > source[j + 1]) {
                    swap(j, j + 1, source);
                }
            }
        }
    }
}
