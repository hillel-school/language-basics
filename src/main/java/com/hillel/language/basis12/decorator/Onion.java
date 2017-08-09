package com.hillel.language.basis12.decorator;

public class Onion extends Decorator {

    public Onion(MealInterface meal) {
        super(meal);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.print("+onion");
    }
}
