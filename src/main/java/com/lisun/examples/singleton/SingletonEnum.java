package com.lisun.examples.singleton;

/**
 * @author Oleksii.Lisun
 * @since 1/3/14
 * Time: 12:51 PM
 */
public enum SingletonEnum {

    ERROR(1, "Description");

    private String name;
    private int position;


    SingletonEnum(int position, String name) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

}

class EnumTest {
    SingletonEnum enumerated = SingletonEnum.ERROR;

    public static void main(String[] args) {
        final EnumTest enumTest = new EnumTest();

        System.out.println(enumTest.enumerated.getName());
    }

}
