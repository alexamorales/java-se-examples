package com.lisun.examples.interview;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * @author Aleksey
 * @since 1/5/14
 */
public class ExampleTest {

    @Test
    public void shouldReturnTrue() {
        //Given
        Test1 test1 = new Test1();
        //When
        String vernut = test1.printName();
        //Then
        assertEquals(vernut, "Hello World!");
    }

}
