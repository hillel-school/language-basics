package com.hillel.language.basis16;


import java.math.BigDecimal;
import java.util.List;

import static com.google.common.collect.ImmutableList.of;
import static java.math.BigDecimal.ONE;

public class StaticImport {

    public static void main(String[] args) {
        List<String> list = of("hello");

        BigDecimal two = ONE.add(ONE);
        BigDecimal twenty = BigDecimal.TEN.add(BigDecimal.TEN);
    }
}
