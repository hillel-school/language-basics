package com.hillel.language.basis26;

import com.google.common.collect.ImmutableList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class H2Main {

    private static List<String> students = ImmutableList.of(
            "Snow", "Sand", "Rivers", "Storm", "Pyke", "Waters", "Stone", "Hill", "Flowers"
    );

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.h2.Driver");

        try (Connection connection = DriverManager.getConnection("jdbc:h2:~/test3")) {

//            Statement statement = connection.createStatement();
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            connection.setAutoCommit(true);

            statement.execute("create schema if not exists test");
            statement.execute("set schema test");
            statement.execute("create table students(id int identity, name varchar(100) default '')");

            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into students (name) values (?)");

            for (String student : students) {
                preparedStatement.setString(1, student);
                preparedStatement.executeUpdate();
            }

            ResultSet resultSet = statement
                    .executeQuery("select id, name from test.students where id > 3 and id < 10");
            while(resultSet.next()) {
                resultSet.updateString("name", "Johnny");
                resultSet.updateRow();
            }

            printTable(statement);


//            ResultSet resultSet = statement.executeQuery("select name from test.students where id < 3");
//            while (resultSet.next()) {
//                String name = resultSet.getString("name");
//                System.out.println(name);
//            }
//
            connection.commit();
            statement.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static void printTable(Statement statement) throws SQLException {
        ResultSet resultSet = statement
                .executeQuery("select * from test.students");
        while(resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            System.out.println(String.format("| %s | %s |", id, name));
        }
    }
}
