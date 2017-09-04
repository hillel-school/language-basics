package com.hillel.language.basis18;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.Date;

@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.NAME)
//@JsonRootName(value = "student")
public class Student {

    @JsonProperty
    int id;
    @JsonProperty
    String name;
    @JsonProperty("lastname")
    String lastName;
    @JsonProperty("birthdate")
    Date birthDate;

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
