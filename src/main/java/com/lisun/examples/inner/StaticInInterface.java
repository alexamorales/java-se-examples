package com.lisun.examples.inner;

/**
 * Created by alekseylisun.
 */
public interface StaticInInterface {

     class InnerClassInInterface {
        static void showSmth() {
            System.out.println("Static class in interface.");
        }

    }

    static void runStaticInnerInInterface() {
//        InnerClassInInterface.showSmth();
        InnerClassInInterface innerClassInInterface = new InnerClassInInterface();
        innerClassInInterface.showSmth();
    }

    default void defaultMethod() {
        System.out.println("Default in Interface");
    }
}
