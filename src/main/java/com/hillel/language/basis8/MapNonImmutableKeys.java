package com.hillel.language.basis8;

import java.util.HashMap;
import java.util.Map;

public class MapNonImmutableKeys {

    public static void main(String[] args) {
        Map<Item, String> itemizedStudents = new HashMap<>();
        Item key = new Item(1);
        itemizedStudents.put(key, "John");
        itemizedStudents.put(new Item(2), "Mark");
        itemizedStudents.put(new Item(3), "Bill");

        System.out.println(itemizedStudents);
//
        key.setNumber(3);
//        key.setNumber(4);
        System.out.println(itemizedStudents);
//
        System.out.println(itemizedStudents.values());
        System.out.println(itemizedStudents.get(new Item(4)));
    }

    static class Item {
        Integer number;

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
            return String.valueOf(number);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Item item = (Item) o;

            return !(number != null ? !number.equals(item.number) : item.number != null);

        }

        @Override
        public int hashCode() {
            return number != null ? number.hashCode() : 0;
        }
    }
}
