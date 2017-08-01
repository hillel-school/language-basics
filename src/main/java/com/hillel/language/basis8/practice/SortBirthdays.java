package com.hillel.language.basis8.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortBirthdays {

    public static void main(String[] args) {

        Birthday mark = new Birthday(3, 7, 1990);
        Birthday john = new Birthday(11, 8, 1970);
        Birthday bob = new Birthday(2, 3, 1985);
        Birthday stew = new Birthday(1, 1, 1993);

        List<Birthday> birthdays = new ArrayList<>();
        birthdays.add(mark);
        birthdays.add(john);
        birthdays.add(bob);
        birthdays.add(stew);

        // ??
        // List<Birthday> sorted = Collections.sort(birthdays);

        System.out.println(birthdays);
    }

    static class Birthday {
        private int day;
        private int month;
        private int year;

        public Birthday(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public int getDay() {
            return day;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }

        @Override
        public String toString() {
            return day + "." + month + "." + year;
        }
    }
}
