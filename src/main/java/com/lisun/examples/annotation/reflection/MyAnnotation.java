package com.lisun.examples.annotation.reflection;

import java.lang.annotation.*;

/**
 * @author Alex
 * @since 20.01.2015
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface MyAnnotation {
    String value() default "";

    String name();

    int age();

    String[] newNames();

}
