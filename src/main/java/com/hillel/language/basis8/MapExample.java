package com.hillel.language.basis8;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
//        Map<Integer, String> students = new LinkedHashMap<>();
//        students.put(1, "John");
//        students.put(2, "Mark");
//        students.put(1, "Bill");
//
//
//        students.remove(1, "John");
//
//        students.remove(1);
//
////        boolean hasJohn = students.containsKey(1);
////        System.out.println(hasJohn);
//        System.out.println(students.get(2));

        Map<Item, String> itemizedStudents = new HashMap<>();

        itemizedStudents.put(new Item(1), "John");
        itemizedStudents.put(new Item(2), "Mark");
        String item = itemizedStudents.put(new Item(1), "Bill");

        System.out.println(itemizedStudents);
        System.out.println(item);
    }

    static class Item {
        Integer number;
        Integer number2;
        Integer number3;
        Integer number4;

        public Item(Integer number) {
            this.number = number;
        }

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return String.valueOf(this.hashCode());
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Item item = (Item) o;
            return Objects.equals(number, item.number) &&
                    Objects.equals(number2, item.number2) &&
                    Objects.equals(number3, item.number3) &&
                    Objects.equals(number4, item.number4);
        }

        @Override
        public int hashCode() {
            return Objects.hash(number, number2, number3, number4);
        }
    }
}
