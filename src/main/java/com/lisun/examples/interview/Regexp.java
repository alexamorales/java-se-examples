package com.lisun.examples.interview;

import com.lisun.examples.oop.Animal;
import com.lisun.examples.oop.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksii.Lisun
 * Date: 10/7/13
 * Time: 1:53 PM
 */
public class Regexp {
    private int one = 1;

    static class Nested {
        public void go() {
            System.out.println("dffd");
        }
    }

    public void sort(int[] arr) {

        for (int i = arr.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1, arr);
                    /* int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;*/
                }
            }
        }
    }

    public List<? super Animal> addAnimal(List<? super Animal> animals, List<? extends Animal> animalsDest) {

        animals.add(new Animal());

        for (Object animal : animalsDest) {
            System.out.println(animal);
        }

        return animals;

    }


    private void swap(int indexOne, int indexTwo, int[] arr) {
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }


    public String matcher(String pattern, String matcher) {
        final Pattern p = Pattern.compile(pattern);
        final Matcher m = p.matcher(matcher);

        String result = "";
        while (m.find()) {
            result += m.group() + "||";
        }
        return result;
    }


    public static void main(String[] args) {
        Regexp.Nested nested = new Nested();
        nested.go();

        Regexp regexp = new Regexp();

        System.out.println(regexp.matcher("\\d\\w", "4567 gt54 67864"));

        int[] arr = {3, 5, 19, 8, 9};

        regexp.sort(arr);

        System.out.println(Arrays.toString(arr));

        List<Dog> dogs = new ArrayList<>();

        ArrayList<Animal> animals = new ArrayList<>();

        regexp.addAnimal(animals, dogs);

        List<Object> numbers = new LinkedList<>();

        regexp.addAnimal(numbers, dogs);

    }
}