package com.lisun.examples.singleton;

/**
 * @author Oleksii.Lisun
 * @since 1/3/14
 *        Time: 12:51 PM
 */
public enum SingletonEnum {
    INSTANCE("Name", 1);

    private SingletonEnum(String name, int ordinal) {

    }

    @Override
    public String toString() {
        return INSTANCE.name();
    }


}
