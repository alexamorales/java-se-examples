package com.lisun.examples.blocks;

/**
 * @author Alex
 * @since 20.10.2014
 */
public class Dog extends Animal {

    static {
        System.out.println("Static block in Dog");
    }

    {
        System.out.println("Instance block in Dog");
    }

    public Dog() {
        System.out.println("Dog`s constructor");
    }

}
