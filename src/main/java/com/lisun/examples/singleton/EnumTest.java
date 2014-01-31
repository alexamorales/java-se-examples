package com.lisun.examples.singleton;

/**
 * @author Oleksii.Lisun
 * @since 1/31/14
 * Time: 6:25 PM
 */
class EnumTest {
    SingletonEnum enumerated = SingletonEnum.ERROR;

    public static void main(String[] args) {
        final EnumTest enumTest = new EnumTest();

        System.out.println(enumTest.enumerated.getName());
    }

}
