package com.lisun.examples.oop;

/**
 * @author Oleksii.Lisun
 * @since 1/31/14
 * Time: 6:24 PM
 */
abstract class AbstractClass {

    public static final String CONSTANT = "Constant string";

    private String regularString = "Instance string";

    public AbstractClass(String regularString) {
        this.regularString = regularString;
    }

    protected abstract void abstractMethod();

    public void regularMethod() {
        System.out.println("regular method");
    }

   protected void showInstanceField() {
        System.out.println("Static method");
    }

    public String getRegularString() {
        System.out.println(regularString);
        return regularString;
    }

    public void setRegularString(String regularString) {
        this.regularString = regularString;
    }
}
