package com.hillel.language.basis8;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.push(4);

        Integer element = stack.peek();
        System.out.println(element);
        System.out.println(stack);

        element = stack.pop();
        System.out.println(element);
        System.out.println(stack);
    }
}
