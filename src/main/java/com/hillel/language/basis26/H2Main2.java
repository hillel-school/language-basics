package com.hillel.language.basis26;

import org.h2.jdbcx.JdbcDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class H2Main2 {

    public static void main(String[] args) {
        JdbcDataSource dataSource = new JdbcDataSource();
        dataSource.setURL("jdbc:h2:~/test");
        dataSource.setUser("");
        dataSource.setPassword("");

        try (Connection connection = dataSource.getConnection()) {
            Statement statement = connection.createStatement();

            statement.execute("set schema test");

            ResultSet resultSet = statement.executeQuery("select name from test.students where id < 7");
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                System.out.println(name);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
