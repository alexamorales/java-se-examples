package com.lisun.examples.interview;

/**
 * @author Oleksii.Lisun
 * @since 1/6/14
 *        Time: 5:33 PM
 */
public class TypicalArrayMethods {
    public static int maxElementInArray(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
