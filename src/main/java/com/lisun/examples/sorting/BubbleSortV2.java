package com.lisun.examples.sorting;

/**
 * Created by alekseylisun.
 *
 * @since 19.01.16
 */
public class BubbleSortV2 implements Sort {

    @Override
    public void sort(int[] source) {

        boolean swapped = true;

        while (swapped) {
            swapped = false;

            for (int i = 1; i < source.length; i++) {
                if (source[i] < source[i - 1]) {
                    Sort.swap(i, i - 1, source);

                    swapped = true;
                }
            }
        }

    }
}
