package com.lisun.examples.datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import static java.time.temporal.ChronoUnit.YEARS;
import static java.util.Date.from;

/**
 * Created by alekseylisun.
 *
 * @since 18.7.16
 */
public class TestDateTimeJava8 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

//        localDateTime = localDateTime.minus(1, YEARS);
          localDateTime = localDateTime.minusYears(1);

        System.out.println(Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant()));

    }
}
