package com.lisun.examples.oop;

/**
 * @author Oleksii.Lisun
 * @since 1/31/14
 * Time: 6:24 PM
 */
abstract class AbstractClass {
    public AbstractClass(String regularString) {
        this.regularString = regularString;
    }

    public static final String CONSTANT = "Constant string";

    private String regularString = "Instance string";

    public abstract void abstractMethod();

    public void regularMethod() {
        System.out.println("regular method");

    }

    public static void showIntanceField() {
        System.out.println("Static method");
    }

}
