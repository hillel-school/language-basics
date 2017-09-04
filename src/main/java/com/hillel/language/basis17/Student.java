package com.hillel.language.basis17;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Date;

public class Student {
    @JacksonXmlProperty(localName = "id", isAttribute = true)
    int id;
    @JacksonXmlProperty
    String name;
    @JacksonXmlProperty(localName = "lastname")
    String lastName;
    @JacksonXmlProperty(localName = "birthdate")
    Date birthDate;

    public Student(int id, String name, String lastName, Date birthDate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
