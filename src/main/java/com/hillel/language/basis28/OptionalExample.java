package com.hillel.language.basis28;

import com.google.common.collect.ImmutableMap;

import java.util.Map;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        ImmutableMap<Integer, String> map = ImmutableMap.of(1, "HI");

        Optional<String> name = getName(map, 2);

        if (name.isPresent()) {
            System.out.println(name.get());
        }

        // ifPresent()
        name.ifPresent(System.out::println);

        // orElse(), orElseThrow()

        //String firstName = name.orElseThrow(IllegalArgumentException::new);
    }

    private static Optional<String> getName(Map<Integer, String> fullname, int key) {
        return Optional.ofNullable(fullname.get(key));
    }

    private static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        public Person() {
        }
    }
}
