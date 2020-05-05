package pl.coderslab.pluralSight.structural.bridge.shape1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BridgeEverydayDemo {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());

            String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";

            Connection conn = DriverManager.getConnection(dbUrl);

            Statement sta = conn.createStatement();

            sta.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");

            System.out.println("Table created");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
