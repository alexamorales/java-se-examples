package com.lisun.examples.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void shouldTestBubbleSort() {
        Sort bubbleSort = new BubbleSort();

        int[] arrActual = {-2, 5, 6, 1, 10, 2, 1};
        int[] arrExpected = arrActual.clone();

        bubbleSort.sort(arrActual);
        Arrays.sort(arrExpected);

        assertArrayEquals("Compare sorted arrays", arrExpected, arrActual);
        System.out.println(Arrays.toString(arrActual) + " == " + Arrays.toString(arrExpected));
    }

    @Test
    public void shouldTestBubbleSortV2() {
        Sort bubbleSort = new BubbleSortV2();

        int[] arrActual = {-2, 5, 6, 1, 10, 2, 1};
        int[] arrExpected = arrActual.clone();

        bubbleSort.sort(arrActual);
        Arrays.sort(arrExpected);

        assertArrayEquals("Compare sorted arrays", arrExpected, arrActual);
        System.out.println(Arrays.toString(arrActual) + " == " + Arrays.toString(arrExpected));
    }

}