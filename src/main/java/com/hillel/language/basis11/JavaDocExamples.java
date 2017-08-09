package com.hillel.language.basis11;

/**
 * This class demonstrates javadocs
 *
 * @author alex stybaev
 * @since 1.0
 */
public class JavaDocExamples {

    /**
     * This javadoc describes this variable
     */
    private Integer variable = 1;

    /**
     * Gets {@code Integer} value of variable
     * @return best variable
     * @see Integer
     */
    public Integer getVariable() {
        Integer a = 1;
        a.intValue();
        return variable;
    }

    /**
     * Sets an {@link Integer} value to variable
     *
     * @param variable
     */
    public void setVariable(Integer variable) {
        this.variable = variable;
    }

    /**
     *
     * @throws Exception
     * @deprecated use {@link #getNext()}
     */
    @Deprecated
    public void next() throws Exception {

    }

    /**
     *
     * @return
     */
    public Integer getNext() {
        return 42;
    }
}
