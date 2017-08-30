package com.hillel.language.basis17;


import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class StudentDomParser {

    public static void main(String[] args) throws Exception {

        File inputFile = new File("src/main/java/com/hillel/language/basis17/students.xml");

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();
        NodeList nodes = doc.getElementsByTagName("student");
        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            if(node.hasAttributes()) {
                System.out.println(node.getAttributes().getLength());
                Node id = node.getAttributes().getNamedItem("id");
                System.out.println(id);
            }
            NodeList children = node.getChildNodes();
            for (int j = 0; j < children.getLength(); j++) {
                Node child = children.item(j);
                System.out.println(child.getNodeType());
//                if(child.getNodeType() == Node.ELEMENT_NODE){
//                    System.out.println(child.getNodeName() + ": " + child.getTextContent());
//                }
            }
        }
    }
}
