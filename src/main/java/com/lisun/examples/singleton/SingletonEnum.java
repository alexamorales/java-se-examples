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

