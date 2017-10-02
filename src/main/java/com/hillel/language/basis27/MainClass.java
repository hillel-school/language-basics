package com.hillel.language.basis27;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        try (SessionFactory sessionFactory = createSessionFactory()) {
            Session session = sessionFactory.openSession();
            @SuppressWarnings("unchecked")
            List<Student> students = session.createQuery(" FROM Student ").list();
            System.out.println(students.get(0));
            session.close();
        }
    }

    private static SessionFactory createSessionFactory() {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Studies.class)
                .configure();
        StandardServiceRegistryBuilder builder =
                new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        return configuration.buildSessionFactory(builder.build());
    }
}
