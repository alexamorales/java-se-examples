package com.lisun.examples.singleton;

/**
 * @author Oleksii.Lisun
 * @since 1/3/14
 *        Time: 12:51 PM
 */
public enum SingletonEnum {

    INSTANCE("Name", 1);

    private String name;
    private int position;


    SingletonEnum(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

}

class EnumTest {
    SingletonEnum enumerated = SingletonEnum.INSTANCE;

    public static void main(String[] args) {
        final EnumTest enumTest = new EnumTest();

        enumTest.enumerated.getName();
    }

}
