package com.lisun.examples.oop;

import java.security.AccessControlException;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksii.Lisun
 * Date: 10/16/13
 * Time: 5:52 PM
 */
public class Dog extends Animal {
    public void vuf(String fuv) throws AccessControlException {
        System.out.println(fuv);
    }

    public void vuf(String fuv, int r) {

    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        try {
            dog.vuf("Fdfdff");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
