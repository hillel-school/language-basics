package com.hillel.language.basis12.decorator;

public class Toast implements MealInterface {

    @Override
    public void eat() {
        System.out.print("toast");
    }
}
