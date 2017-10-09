package com.hillel.language.basis28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExample {

    static List<Person> list = new ArrayList<>();

    static {
        list.add(new Person("Ann", 32));
        list.add(new Person("Joe", 32));
        list.add(new Person("Jinny", 32));
        list.add(new Person("Jack", 32));
        list.add(new Person("Ivan", 32));
    }


    public static void main(String[] args) {
        lambdaComparator();
        // lambdaRunnable();
        // lambdaForEach();
    }


    private static void lambdaRunnable() {
        new Thread(() -> {
            System.out.println("Hello lambda");
        }).start();
    }

    private static void lambdaComparator() {

//        Collections.sort(list, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return Integer.compare(o1.getAge(), o2.getAge());
//            }
//        });
//
//        // (o1) -> o1 == ... (Person o1) { return o1; }
//        Collections.sort(list, (person1, person2) -> {
//            System.out.println(person1.getName());
//            return Integer.compare(person1.getAge(), person2.getAge());
//        });

        Collections.sort(list, Comparator.comparing(Person::getAge).thenComparing(Person::getName));

        System.out.println(list);
    }

    private static void lambdaForEach() {
        list.forEach(person -> System.out.println(person.getName()));
    }


    private static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Person{");
            sb.append("name='").append(name).append('\'');
            sb.append(", age=").append(age);
            sb.append('}');
            return sb.toString();
        }
    }
}
