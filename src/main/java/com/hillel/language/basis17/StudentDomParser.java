package com.hillel.language.basis17;


import jdk.nashorn.internal.runtime.regexp.joni.constants.NodeType;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class StudentDomParser {

    public static void main(String[] args) throws Exception {

        File inputFile = new File("/Users/alexstybaev/IdeaProjects/Hillel/src/main/java/com/hillel/language/basis20/conf.xml");

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document doc = documentBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();

        NodeList nodeList = doc.getElementsByTagName("configuration");
        Node configuration = nodeList.item(0);
        String extension = null;
        String directory = null;
        for (int i = 0; i < configuration.getChildNodes().getLength(); i++) {
            Node node = configuration.getChildNodes().item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE && "directory".equals(node.getNodeName())){
                directory = node.getTextContent();
                System.out.println(directory);
            }
            else if (node.getNodeType() == Node.ELEMENT_NODE && "extension".equals(node.getNodeName())) {
                extension = node.getTextContent();
                System.out.println(extension);
            }
        }
        System.out.println(directory);
        System.out.println(extension);
    }

}
