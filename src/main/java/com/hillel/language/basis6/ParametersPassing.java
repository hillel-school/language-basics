package com.hillel.language.basis6;

public class ParametersPassing {

    public static void main(String[] args) {
        ParametersPassing exampleObject = new ParametersPassing();

        Inner changeSubject = new Inner(555);

        exampleObject.changeObject(changeSubject, 1);
        System.out.println(changeSubject.getI() == 555);
    }

    void changeObject(Inner changeSubject, int i) {
        changeSubject = new Inner(i);
        changeSubject.setI(i);
        System.out.println("changeObject " + String.valueOf(changeSubject.getI() == 555));
    }

    static class Inner {
        int i;

        public Inner(int i) {
            this.i = i;
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Inner inner = (Inner) o;

            return i == inner.i;

        }

        @Override
        public int hashCode() {
            return i;
        }
    }

}
