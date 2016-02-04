package com.lisun.examples.inner;

/**
 * Created by alekseylisun.
 *
 * @since 03.02.16
 */
public class Outer {

    private String inOuter = "outer";

    private static String staticInOuter = "staticOuter";

    public static class NestedStatic {

        private String inNestedVar = "nested";

        public void inNested() {
            System.out.println(inNestedVar + staticInOuter);
        }

        public static void staticInNestedStatic() {
            System.out.println("staticInStaticNested");
        }

    }

    public static void main(String[] args) {

        Outer.NestedStatic nestedStatic = new Outer.NestedStatic();

        nestedStatic.inNested();

        Outer.NestedStatic.staticInNestedStatic();
    }
}
