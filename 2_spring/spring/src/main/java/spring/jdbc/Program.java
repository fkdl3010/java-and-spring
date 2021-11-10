package spring.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Program {

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306", "root", "1111");
            System.out.println("");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
