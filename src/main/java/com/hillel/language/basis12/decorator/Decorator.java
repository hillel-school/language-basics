package com.hillel.language.basis12.decorator;

public abstract class Decorator implements MealInterface {

    MealInterface meal;

    public Decorator(MealInterface meal) {
        this.meal = meal;
    }

    @Override
    public void eat() {
        meal.eat();
    }
}
