package com.hillel.language.basis28;

import com.google.common.collect.ImmutableList;
import com.hillel.language.basis9.ImmutableLists;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExample {

    public static void main(String[] args) throws IOException {

        List<String> list = ImmutableList.of("Ann", "Bill", "Michael", "Bob");

        // creating streams:
        list.stream();

        Stream.of(list);

        Stream.of(1, 2, 3, 4);

        "Hello, Java".chars();

        Arrays.stream(new int[]{1,2,3,4,5});

         Files.lines(Paths.get("hi.txt"));

        // intermediate operations filter(), map(), distinct(), skip(), limit() etc

        list.stream()
                .filter(s -> s.length() > 3);

        list.stream()
                .limit(1)
                .map(String::length);

        list.stream()
                .map(s1 -> s1.length());

        // terminal operations findFirst(), findAny(), collect(), count(), anyMatch() etc

        // System.out.println(IntStream.range(1, 10));

        list.stream()
            .filter(s -> s.length() > 3)
            .collect(Collectors.toList());

        // number streams: sum(), average(), mapToObj()

        IntStream.of(1,2,3,4,6,7).sum();

        // Collectors toList, toSet, toMap

        System.out.println(list.stream()
                .collect(Collectors.averagingInt(String::length)));

        LocalDate date = LocalDate.of(1990, 12, 25);
    }
}
