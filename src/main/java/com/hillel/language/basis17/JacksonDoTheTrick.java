package com.hillel.language.basis17;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.sun.org.apache.xerces.internal.impl.PropertyManager;
import com.sun.xml.internal.stream.writers.XMLStreamWriterImpl;

import javax.xml.stream.XMLStreamWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JacksonDoTheTrick {

    public static void main(String[] args) throws IOException {
        XmlMapper mapper = new XmlMapper();
        mapper.setDateFormat(new SimpleDateFormat("dd-MM-yyyy"));

        Student s = mapper.readValue(new File("src/main/java/com/hillel/language/basis17/student.xml"),
                Student.class);

        XMLStreamWriter writer = new XMLStreamWriterImpl(
                new FileWriter(new File("src/main/java/com/hillel/language/basis17/student2.xml")),
                new PropertyManager(PropertyManager.CONTEXT_WRITER));

        mapper.writeValue(writer, new Student(12, "da", "dad", new Date()));

        System.out.println(s.birthDate);
    }
}
