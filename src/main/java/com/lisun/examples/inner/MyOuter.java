package com.lisun.examples.inner;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksii.Lisun
 * Date: 12/31/13
 * Time: 4:04 PM
 */
public class MyOuter {

    private int x = 7;

    public void makeInner() {
        MyInner inner = new MyInner();
        inner.seeOuter();
    }

    // Regular inner class
    private class MyInner {
        public void seeOuter() {
            System.out.println("Outer x is: " + x);
            System.out.println("Inner class ref is " + this);
            System.out.println("Outer class ref is " + MyOuter.this);
        }
    }

    //Local inner class
    public void localInnerClass(final int i) {
        final String string = "LocalInner: ";

        class LocalInner {
            private void seeLocalParameter() {
                System.out.println(string + x);
            }
        }
        final LocalInner localInner = new LocalInner();
        localInner.seeLocalParameter();
    }

//     Anonymous inner class refer to test.folder.Popcorn class


    //    Static nested class
    private static class StaticNestedClass {

        void inStaticNested() {
            System.out.println("Hi from static nested");
        }

    }

    public static void main(String[] args) {
        // Regular inner instantiation and methods call
        final MyOuter outer = new MyOuter();
        outer.makeInner();
        MyOuter.MyInner myInner = outer.new MyInner();
        myInner.seeOuter();

        MyOuter.MyInner myInner1 = new MyOuter().new MyInner();
        myInner1.seeOuter();
        //Call for local inner class

        outer.localInnerClass(6);
        //Call for static nested
        MyOuter.StaticNestedClass staticNestedClass = new MyOuter.StaticNestedClass();
        staticNestedClass.inStaticNested();

    }
}
