package com.hillel.language.basis17;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class StudentSaxParser {

    public static void main(String[] args){
        try {
            File inputFile = new File("src/main/java/com/hillel/language/basis17/students.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler defaultHandler = new StudentsHandler();
            saxParser.parse(inputFile, defaultHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static class StudentsHandler extends DefaultHandler {
        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            String s = new String(ch, start, length);
            System.out.println(s.trim());
            super.characters(ch, start, length);
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if (attributes.getLength() > 0) {
                System.out.println(attributes.getValue("id"));
            }
            super.startElement(uri, localName, qName, attributes);
        }


    }
}
