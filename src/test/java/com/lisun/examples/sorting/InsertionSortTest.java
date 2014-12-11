package com.lisun.examples.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author Alex
 * @since 11.12.2014
 */
public class InsertionSortTest {

    @Test
    public void shouldTestInsertionSort() {
        InsertionSort insertionSort = new InsertionSort();
        int[] arrActual = {-2, 5, 6, 1, 10, 2, 1};
        int[] arrExpected = arrActual.clone();

        insertionSort.sort(arrActual);
        Arrays.sort(arrExpected);

        Assert.assertArrayEquals("Compare sorted arrays", arrExpected, arrActual);


    }
}
