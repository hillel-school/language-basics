package com.hillel.language.basis8;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        // Set<String> set = new TreeSet<>();
//        // Set<String> set = new LinkedHashSet<>();
//
//
//        set.add("Mark");
//        set.add("John");
//        set.add("Ryan");
//        boolean wasAdded = set.add("Mark");
//        System.out.println(wasAdded);
//        System.out.println(set);

        Set<Student> students = new TreeSet<>();

        students.add(new Student("Mark"));
        students.add(new Student("John"));
        students.add(new Student("Ryan"));
        students.add(new Student("Mark"));

        System.out.println(students.size());
        System.out.println(students);
    }

    private static class Student implements Comparable<Student> {
        String firstName;

        public Student(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return firstName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Student student = (Student) o;

            return firstName.equals(student.firstName);

        }

        @Override
        public int hashCode() {
            return this.firstName.hashCode();
        }

        @Override
        public int compareTo(Student o) {
            return this.firstName.compareTo(o.getFirstName());
        }

        @Override
        public String toString() {
            return this.firstName;
        }
    }
}
