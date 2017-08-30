package com.hillel.language.basis17;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileReader;
import java.util.Iterator;

public class StudentStaxParser {

    public static void main(String[] args) throws Exception {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        // reading by events
        XMLEventReader eventReader =
                factory.createXMLEventReader(new FileReader("src/main/java/com/hillel/language/basis17/students.xml"));

        // step by step reading the events
        while (eventReader.hasNext()) {
            XMLEvent event = eventReader.nextEvent();

            // separating event types
            switch (event.getEventType()) {
                case XMLStreamConstants.START_ELEMENT: {
                    StartElement startElement = event.asStartElement();
                    Iterator iterator = startElement.getAttributes();
                    while (iterator.hasNext()) {
                        Attribute attribute = (Attribute)iterator.next();
                        System.out.println(attribute.getValue());
                    }
                }
            }
        }
    }
}

