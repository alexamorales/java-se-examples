package com.lisun.examples.oop;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksii.Lisun
 * Date: 10/16/13
 * Time: 5:52 PM
 */
public class Animal implements Running {
    public int getId() {
        return id;
    }

    private int id;

    public void exc() {
        System.out.println(id);
    }

    @Override
    public void run() {
        System.out.println("implemented method");
    }
}
