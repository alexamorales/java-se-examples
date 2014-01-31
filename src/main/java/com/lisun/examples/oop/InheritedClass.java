package com.lisun.examples.oop;

/**
 * @author Oleksii.Lisun
 * @since 1/31/14
 * Time: 6:24 PM
 */
class InheritedClass extends AbstractClass implements Bounceable {

    public InheritedClass(String regularString) {
        super(regularString);
    }

    @Override
    public void abstractMethod() {
        System.out.println("Implemented");
    }

    @Override
    public void abstractInInterface() {
        System.out.println("Implemented");
    }
}
