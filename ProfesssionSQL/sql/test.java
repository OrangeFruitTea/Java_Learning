package sql;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class test {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql//localhost:3306/";
            Connection connector = DriverManager.getConnection(url, "root", "");

            Statement st = connector.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
