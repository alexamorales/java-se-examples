package com.lisun.examples.lambdas.functionalstuffrepeating;

/**
 * Created by alekseylisun.
 *
 * @since 10.2.17
 */
public class Advertisement {
    private String title = "Interesting review of : ";
    private Book book = null;

    public Advertisement(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return title + "\n" + book;
    }
}
