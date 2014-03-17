package com.lisun.examples.generics.container;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Aleksey
 * @since 2/5/14
 */
@Setter
@Getter
public class Container<T extends Comparable<T>> {
    private T item;

}
