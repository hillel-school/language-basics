package com.hillel.language.basis11.iterator;

public class Containers {

//    public static <T> EnhancedContainer<T> createContainer(int maxSize) {
//        return new EnhancedContainer<>(maxSize);
//    }

    public static <T> EnhancedContainer<T> createTenElementsContainer() {
        return new EnhancedContainer<>(10);
    }
}
