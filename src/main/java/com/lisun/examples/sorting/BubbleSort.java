package com.lisun.examples.sorting;

/**
 * @author Alex
 * @since 30.10.2014
 */
public class BubbleSort {
    public static void sort(int[] arr) {

        for (int i = arr.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1, arr);
                }
            }
        }
    }

    private static void swap(int indexOne, int indexTwo, int[] arr) {
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }


}
