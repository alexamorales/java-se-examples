package com.lisun.examples.interview;

import org.junit.Test;

import static com.lisun.examples.interview.StringRevertUtils.revertString;
import static com.lisun.examples.interview.StringRevertUtils.revertedWithChar;
import static org.junit.Assert.assertEquals;

/**
 * @author Alex
 * @since 20.10.2014
 */
public class RevertedStringTest {

    @Test
    public void shouldReturnRevertedString() {
        String expected = "FEDCBA";
        String actual = revertedWithChar("ABCDEF");
        assertEquals("Should return reverted string", expected, actual);
    }

    @Test
    public void shouldReturnAnotherRevertedString() {
        String expected = "FEDCBA";
        String actual = revertString("ABCDEF");
        assertEquals("Should return reverted string", expected, actual);
    }


}
