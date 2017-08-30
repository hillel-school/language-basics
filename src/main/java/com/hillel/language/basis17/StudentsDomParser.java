package com.hillel.language.basis17;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class StudentsDomParser {

    public static void main(String[] args) throws Exception {

        File inputFile = new File("src/main/java/com/hillel/language/basis17/students.xml");

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();

        // find by element name
        NodeList nodes = doc.getElementsByTagName("name");

        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            if(node.getNodeType() == Node.ELEMENT_NODE) {
                System.out.println(node.getTextContent());
            }
        }

        // find by element name
        nodes = doc.getElementsByTagName("student");
        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            if(node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String id = element.getAttribute("id");
                String name = element.getElementsByTagName("name").item(0).getTextContent();
                String lastName = element.getElementsByTagName("lastname").item(0).getTextContent();
                System.out.println("student id: " + id + ", name: " + name + ", last name: " + lastName);
            }
        }
    }
}
