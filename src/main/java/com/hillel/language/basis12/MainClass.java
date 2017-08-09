package com.hillel.language.basis12;

import com.hillel.language.basis12.decorator.Bacon;
import com.hillel.language.basis12.decorator.MealInterface;
import com.hillel.language.basis12.decorator.Onion;
import com.hillel.language.basis12.decorator.Toast;

public class MainClass {

    public static void main(String[] args) {
        MealInterface meal = new Onion(new Onion(new Toast()));

        meal.eat();
    }
}
