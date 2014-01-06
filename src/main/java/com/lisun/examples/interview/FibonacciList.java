package com.lisun.examples.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oleksii.Lisun
 * @since 1/6/14
 *        Time: 3:41 PM
 */
public class FibonacciList {

    public static List<Long> findFibonacciList(int number) {
        List<Long> numberList = new ArrayList<>();
        numberList.add(0L);

        if (number < 0 || number > 93) throw new RuntimeException("0..93 is permitted");
        if (number == 0) return numberList;
        numberList.add(1L);
        if (number == 1) return numberList;
        numberList.add(1L);

        return findFibonacciNumber(number, numberList);
    }

    private static List<Long> findFibonacciNumber(int edgeNumber, List<Long> numberList) {
        numberList.add(numberList.get(numberList.size() - 1) + numberList.get(numberList.size() - 2));
        return (numberList.size() == edgeNumber) ? numberList : findFibonacciNumber(edgeNumber, numberList);
    }
}
