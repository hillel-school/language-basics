package com.hillel.language.basis17;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
public class Students {

    @JacksonXmlElementWrapper
    Student[] student;
}
