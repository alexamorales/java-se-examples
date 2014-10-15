package com.lisun.examples.inner;

/**
 * @author Alex
 * @since 16.10.2014
 */
public class LocalStaticInner {

    public static void holder() {
        int finalVariable = 4;
        class InnerInStatic {
            int b = 2;

            private void showVariable() {
                System.out.println(finalVariable + b);
            }
        }


        InnerInStatic innerInStatic = new InnerInStatic();
        innerInStatic.showVariable();

    }


    public static void main(String[] args) {

        holder();


    }


}
