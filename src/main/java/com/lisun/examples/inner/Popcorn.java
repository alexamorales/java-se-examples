package com.lisun.examples.inner;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksii.Lisun
 * Date: 12/31/13
 * Time: 4:50 PM
 */
public class
Popcorn {
    public void pop() {
        System.out.println("popcorn");
    }

    public void pop(int a) {
        System.out.println(a);
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

            @Override
            public void pop(int a) {
                super.pop(a);
            }
        };

        p.pop();

        p.pop(3);

    }


}