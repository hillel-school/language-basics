package com.hillel.language.basis10.factory_method;

import com.google.common.collect.Lists;

public class Main {

    public static void main(String[] args) {
        ShapeCreator creator = new ShapeCreator2D();

        Shape shape = creator.create("Circle");
        //Lists.newArrayList(1,2);
        System.out.println(shape.size());
    }
}
