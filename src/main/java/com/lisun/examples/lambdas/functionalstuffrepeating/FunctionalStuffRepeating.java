package com.lisun.examples.lambdas.functionalstuffrepeating;

import java.util.Arrays;
import java.util.List;

/**
 * Created by alekseylisun.
 *
 * @since 10.2.17
 */
public class FunctionalStuffRepeating {


    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book("Dorian Grey", true),
                new Book("Time to live and time to death", false)
        );

        Advertisement ad = Book.makeAd.apply(bookList.get(0));
        System.out.println(ad);

        System.out.println(Book.isAvailable.test(bookList.get(1)));

        Book.newBookDraft.get();

        Book.smtAbout.accept(bookList.get(0));


    }

}
