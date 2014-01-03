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
    Popcorn p = new Popcorn() {
        @Override
        public void pop() {
            System.out.println("anonymous popcorn");
        }

        public void sizzle() {
            System.out.println("anonymous sizzling popcorn");
        }
    };


}