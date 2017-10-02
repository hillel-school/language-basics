package com.hillel.language.basis26;

import com.google.common.collect.ImmutableList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class MySqlInitMain {

    private static List<String> students = ImmutableList.of(
            "Snow", "Sand", "Rivers", "Storm", "Pyke", "Waters", "Stone", "Hill", "Flowers"
    );

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/hillel?" +
                            "user=root&password=")) {


            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            connection.setAutoCommit(true);

            statement.execute("create table students(id int AUTO_INCREMENT PRIMARY KEY, name varchar(100) default '')");

            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into students (name) values (?)");

            for (String student : students) {
                preparedStatement.setString(1, student);
                preparedStatement.executeUpdate();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
