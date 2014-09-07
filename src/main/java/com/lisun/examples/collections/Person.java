package com.lisun.examples.collections;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.ObjectUtils;

/**
 * @author Aleksey
 * @since 5/16/2014
 */
@Getter
@Setter
public class Person implements Comparable<Person> {
    private int age;
    private String name;

    @Override
    public int compareTo(Person o) {
        return ObjectUtils.compare(o.name, this.name);
    }

}
