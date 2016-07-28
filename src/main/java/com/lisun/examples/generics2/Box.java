package com.lisun.examples.generics2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alekseylisun.
 *
 * @since 02.12.15
 */
public class Box<T extends Number> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {

        List<? extends Number> objects = new ArrayList<>();


        List raw = new ArrayList<>();
        raw.add(2);
        raw.add(new Object());


        List<Integer> objects1 = new ArrayList<>();
        objects1.add(1);

        objects1 = raw;

        objects = objects1;

        Box<Integer> integerBox = new Box<>();
        integerBox.setT(2);

        integerBox.inspect(Integer.valueOf("2"));

        System.out.println(integerBox.getT());

        List<? extends Object> list1 = new ArrayList<>();

        List<String> list = new ArrayList<>();

        list.add("string");

        list1 = list;

    }
}
