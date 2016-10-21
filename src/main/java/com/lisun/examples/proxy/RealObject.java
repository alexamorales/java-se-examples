package com.lisun.examples.proxy;

/**
 * Created by alekseylisun.
 *
 * @since 19.10.16
 */
public class RealObject implements Interface {
    @Override
    public void doSomething() {
        System.out.println("Do something");
    }

    @Override
    public void somethingElse(String args) {
        System.out.println("Do something else: " + args);
    }
}
