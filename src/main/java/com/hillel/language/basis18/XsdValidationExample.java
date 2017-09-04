package com.hillel.language.basis18;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class XsdValidationExample {

    public static void main(String[] args) throws Exception {
        URL schemaFile = new URL("file:/Users/alexstybaev/IdeaProjects/Hillel/src/main/java/com/hillel/language/basis18/schema.xsd");
        Source xmlFile = new StreamSource(new File("src/main/java/com/hillel/language/basis17/students.xml"));
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        try {
            Schema schema = schemaFactory.newSchema(schemaFile);
            Validator validator = schema.newValidator();
            validator.validate(xmlFile);
            System.out.println(xmlFile.getSystemId() + " is valid");
        } catch (SAXException e) {
            System.out.println(xmlFile.getSystemId() + " is NOT valid reason:" + e);
        } catch (IOException e) {
            System.out.println(xmlFile.getSystemId() + " is NOT valid reason:" + e);
        }
    }
}
