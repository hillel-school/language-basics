package com.hillel.language.basis10.factory_method;

public class ShapeCreator2D implements ShapeCreator {

    @Override
    public Shape create(String name) {
        switch (name) {
            case "Circle": return new Circle();
            case "Square": return new Square();
            default: throw new IllegalArgumentException();
        }
    }
}
