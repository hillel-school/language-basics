package com.hillel.language.basis6;

public class InstanceOf {

    public static void main(String[] args) {
        String s = new String("d");

//        System.out.println(s instanceof String);
//        System.out.println(s instanceof Object);
        System.out.println(s.getClass());
//        System.out.println(s.getClass().equals(Object.class));

        Child child = new Child();
        Parent parent = new Parent();
        GrandParent grandParent = new GrandParent();

//        System.out.println(child instanceof GrandParent);
//        System.out.println(grandParent instanceof Parent);
//        System.out.println(child.getClass().equals(GrandParent.class));
//        System.out.println(grandParent.getClass().equals(Parent.class));
//
//        GrandParent grandParent1 = new Child();
//        System.out.println(grandParent1 instanceof Child);
//        System.out.println(grandParent1 instanceof GrandParent);
//        System.out.println(grandParent1.getClass().equals(Child.class));
//        System.out.println(grandParent1.getClass().equals(GrandParent.class));

//        String l = null;
//        System.out.println(l instanceof String);
    }

    private static class Child extends Parent {

    }

    private static class Parent extends GrandParent {

    }

    private static class GrandParent {

    }
}
