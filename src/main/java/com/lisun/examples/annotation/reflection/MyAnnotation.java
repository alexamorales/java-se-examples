package com.lisun.examples.annotation.reflection;

import java.lang.annotation.*;

/**
 * Test annotation to improve core skills
 * <p> Some tagged text <p/>
 * @author Alex
 * @since 20.01.2015
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@Documented
public @interface MyAnnotation {
    String value() default "";

    String name();

    int age();

    String[] newNames();

}
