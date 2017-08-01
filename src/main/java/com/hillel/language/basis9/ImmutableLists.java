package com.hillel.language.basis9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableLists {

    public static void main(String[] args) {
        List<Item> originalList = new ArrayList<Item>();
        Item item1 = new Item(1);
        Item item2 = new Item(2);
        originalList.add(item1);
        originalList.add(item2);

        List<Item> unmodifiableList = Collections.unmodifiableList(originalList);

        item1.setNumber(3);
        //unmodifiableList.add(new Item(3));

        System.out.println(unmodifiableList);
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
    }
}
