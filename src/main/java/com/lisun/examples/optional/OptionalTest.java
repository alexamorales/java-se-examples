package com.lisun.examples.optional;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author Alex
 * @since 03.04.2015
 */
public class OptionalTest {
    public static void main(String[] args) {


        ForTest forTest = new ForTest();
        forTest.setName("Alex2");

        Optional<ForTest> forTestOptional = Optional.ofNullable(forTest);

        System.out.println(forTestOptional.orElseThrow(RuntimeException::new));

    }
}


class ForTest {
    private String name;
    private int age;

    public ForTest() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "\n" + age;

    }
}

class CustomSupplier implements Supplier<ForTest> {
    private ForTest forTest;

    @Override
    public ForTest get() {
        forTest = new ForTest();
        forTest.setName("Alex");
        return forTest;
    }


}