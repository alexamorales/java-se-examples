package com.lisun.examples.interview;

/**
 * @author Aleksey
 * @since 1/28/14
 */
public class StringRevertUtils {

    public static String revertString(String str) {
        String revertedString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revertedString += str.charAt(i);
        }
        return revertedString;
    }

    public static String revertedWithChar(String str) {
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length / 2; i++) {
            char temp;
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(revertString("abcd"));
        System.out.println(revertedWithChar("abcd"));


    }


}
