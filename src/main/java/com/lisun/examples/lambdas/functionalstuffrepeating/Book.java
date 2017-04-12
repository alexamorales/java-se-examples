package com.lisun.examples.lambdas.functionalstuffrepeating;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by alekseylisun.
 *
 * @since 10.2.17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    public static Function<Book, Advertisement> makeAd = Advertisement::new;
    public static Predicate<Book> isAvailable = Book::isAvailable;
    public static Supplier<Book> newBookDraft = Book::new;
    public static Consumer<Book> smtAbout = b -> System.out.println(b.getTitle());
    private String title;
    private boolean available;


}
