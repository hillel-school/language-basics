package com.hillel.language.basis5;

public interface Repairable {

    // question - what access modifier is here?
    boolean canRepair(int damageFactor);

//    default boolean canHaveBody() {
//        return true;
//    }
}
