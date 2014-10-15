package com.lisun.examples.inner;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksii.Lisun
 * Date: 12/31/13
 * Time: 4:50 PM
 */
public class Popcorn {
    public void pop() {
        System.out.println("popcorn");
    }
}

class Food {
    public static void main(String[] args) {
        int a = 2;

        Popcorn p = new Popcorn() {
            @Override
            public void pop() {
                System.out.println("anonymous popcorn" + a);
            }

            public void sizzle() {
                System.out.println("anonymous sizzling popcorn");
            }
        };

        p.pop();


    }


}