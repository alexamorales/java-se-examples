package com.lisun.examples.annotation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.annotation.Annotation;
import java.util.Arrays;

/**
 * @author Alex
 * @since 20.01.2015
 */
@MyAnnotation(
        name = "name",
        age = 1,
        newNames = {"Alex", "Mike"}
)
public class UsageMyAnnotation {

    private static void tryAnnotation() {
        Class aClass = UsageMyAnnotation.class;
        Annotation[] annotations = aClass.getAnnotations();

        for (Annotation annotation : annotations) {
            if (aClass.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation myAnnotation = (MyAnnotation) annotation;
                System.out.println("age is: " + myAnnotation.age());
                System.out.println("value is: " + myAnnotation.value());
                System.out.println("names are: " + Arrays.toString(myAnnotation.newNames()));
                System.out.println("Canonical name; " + aClass.getCanonicalName());
                System.out.println("Regular class name; " + aClass.getName());
                System.out.println("Simple class name; " + aClass.getSimpleName());
                System.out.println("Type class name; " + aClass.getTypeName());
            }
        }
    }

    private static void readFile(File file) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);


    }

    public static void main(String[] args) {
        tryAnnotation();
    }

}
