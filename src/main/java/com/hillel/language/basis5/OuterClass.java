package com.hillel.language.basis5;

import java.util.Arrays;
import java.util.Comparator;

public class OuterClass {

    public static class StaticNestedClass {

    }

    public class InnerClass {
        int toughnessLevel;

        public InnerClass(int toughnessLevel) {
            this.toughnessLevel = toughnessLevel;
        }

        public int getToughnessLevel() {
            return toughnessLevel;
        }
    }

    public void anonymouseClassDemo(InnerClass[] objs) {
        Arrays.sort(objs, new Comparator<InnerClass>() {
            @Override
            public int compare(InnerClass o1, InnerClass o2) {
                return Integer.compare(o1.getToughnessLevel(), o2.getToughnessLevel());
            }
        });
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        InnerClass[] array = {new OuterClass().new InnerClass(1), new OuterClass().new InnerClass(2)};
        StaticNestedClass[] array2 = {new StaticNestedClass()};

        outerClass.anonymouseClassDemo(array);
    }

    class MyComparator implements Comparator<InnerClass> {
        @Override
        public int compare(InnerClass o1, InnerClass o2) {
            return Integer.compare(o1.getToughnessLevel(), o2.getToughnessLevel());
        }
    }
}
