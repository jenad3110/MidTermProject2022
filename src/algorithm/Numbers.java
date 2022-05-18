package algorithm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Numbers {

    public static void main(String[] args) throws SQLException {

    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world/","root", "abcd123");
        Statement stat = connection.createStatement();

        String s="select * city;";

        stat.execute(s);

    }



}



