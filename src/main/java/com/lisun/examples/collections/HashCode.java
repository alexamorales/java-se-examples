package com.lisun.examples.collections;

/**
 * @author Alex
 * @since 25.10.2014
 */
public class HashCode {
    int a = 5;
    int b = 6;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HashCode hashCode = (HashCode) o;

        if (a != hashCode.a) return false;
        if (b != hashCode.b) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        return result;
    }

    @Override
    public String toString() {
        return "HashCode{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
