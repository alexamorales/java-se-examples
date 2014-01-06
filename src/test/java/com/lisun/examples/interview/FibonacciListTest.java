package com.lisun.examples.interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Oleksii.Lisun
 * @since 1/6/14
 *        Time: 3:54 PM
 */
public class FibonacciListTest {

    @Test(expected = RuntimeException.class)
    public void ifNegativeException() {
        FibonacciList.findFibonacciList(-1);
    }

    @Test(expected = RuntimeException.class)
    public void ifGreaterThan93Exception() {
        FibonacciList.findFibonacciList(94);
    }

    @Test
    public void first0FibonacciLists() {
        List<Long> numberList = new ArrayList<>(Arrays.asList(0L));

        assertEquals(numberList, FibonacciList.findFibonacciList(0));
    }

    @Test
    public void first1FibonacciLists() {
        List<Long> numberList = new ArrayList<>(Arrays.asList(0L, 1L));

        assertEquals(numberList, FibonacciList.findFibonacciList(1));
    }

    @Test
    public void first10FibonacciLists() {
        List<Long> numberList = new ArrayList<>(Arrays.asList(0L, 1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L, 34L, 55L, 89L, 144L, 233L, 377L, 610L,
                987L, 1597L, 2584L, 4181L));

        assertEquals(numberList, FibonacciList.findFibonacciList(20));
    }
}
