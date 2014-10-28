package com.lisun.examples.blocks;

/**
 * @author Alex
 * @since 20.10.2014
 */
public class Animal {

    static {
        System.out.println("Static block in Animal");
    }

    {
        System.out.println("Instance block in Animal");
    }

    public Animal() {
        System.out.println("Animal`s constructor");
    }
}
