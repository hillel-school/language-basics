package com.hillel.language.basis10;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionHandlingParent {

    public static void main(String[] args) {

        ExceptionHandlingParent parent = new ExceptionHandlingParent();

        try {
            parent.getFileContent();
            parent.do2();
            parent.doSomethingElse("1e2");
        } catch (IOException e) {
            System.out.println("Something happend: ");
        } catch (SQLException e) {
            System.out.println("Nothing serious");
            System.exit(0);
        } finally {
            System.out.println("finally");
        }

    }

    // SQLException
    public void getFileContent() throws IOException {
        File f = new File("dasda");
        try {
            boolean success = f.createNewFile();
        } catch (IOException e) {
            System.out.println("error occured");
            throw new IOException();
        }


        //throw new SQLException();
//        throw new IOException();
//        throw new Exception();
    }

    public void doSomethingElse(String number) throws NumberFormatException {
        //
    }

    public void do2() throws SQLException {
        throw new SQLException();
    }


}
