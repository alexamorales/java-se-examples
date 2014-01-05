package com.lisun.examples.interview;

/**
 * @author Oleksii.Lisun
 * @since 1/3/14
 *        Time: 4:05 PM
 */
public class PrimitiveTypeNarrowing {
    public static void main(String[] args) {
        double a = 5.0;
        double b = 3.0;

        System.out.println(a / b);

        double dd1 = 1234.5678;
        int ii1 = (int) dd1;
        double dd2 = (int) dd1;
        double dd3 = (int) (dd1 * 100) / 100.0;

        System.out.println(dd3);
        showNumbers((short) 9, (short) 10);

        float floatNumber = 45 / 21.0f;
        System.out.println(floatNumber);

    }

    private static int showNumbers(byte i, int k) {
        return i + k;
    }

    private static int showNumbers(short i, short k) {
        return i + k;
    }
}
