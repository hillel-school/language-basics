package com.hillel.language.basis12.decorator;

public class Bacon extends Decorator {

    public Bacon(MealInterface meal) {
        super(meal);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("bacon");
    }
}
