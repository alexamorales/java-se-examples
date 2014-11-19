package com.lisun.examples.singleton;

/**
 * @author Aleksey
 * @since 31.12.13
 */
public class Singleton {

    private Singleton() {
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();

        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2);

    }

    //TODO add another variant of Singleton


}
