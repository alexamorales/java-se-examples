package com.lisun.examples;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksii.Lisun
 * Date: 1/2/14
 * Time: 12:58 PM
 */
public class OOP {
}

 interface Bounceable {
     int size = 3;
     void abstractInInterface();
 }

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


class Main {
    public static void main(String[] args) {

    }
}
