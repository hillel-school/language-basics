package com.hillel.language.basis11;

import com.hillel.language.basis11.iterator.Containers;
import com.hillel.language.basis11.iterator.EmptyContainerException;
import com.hillel.language.basis11.iterator.EnhancedContainer;

import java.util.Iterator;

public class MainClass {

    public static void main(String[] args) throws Exception {

        //EnhancedContainer<Integer> container = new EnhancedContainer<>(10);
        EnhancedContainer<Integer> container = Containers.createTenElementsContainer();

        Iterator<Integer> iterator = container.iterator();

        System.out.println(iterator.hasNext()); // false

        // container.get();

        container.add(5);
        System.out.println(iterator.hasNext()); // true
        //
        System.out.println(iterator.next()); // 5
        System.out.println(iterator.hasNext()); // false
//            System.out.println(iterator.next());

        try {
            System.out.println(iterator.next());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(container.get());
    }
}
