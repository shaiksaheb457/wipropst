package com.wiproA.mockitodemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EX3 {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/company_db";
        String username = "root";
        String password = "@Msdhoni7"; // replace with your MySQL password

        String sql = "INSERT INTO employee (emp_name, department) VALUES (?, ?)";

        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, "Saheb");
            statement.setString(2, "IT");
            
            statement.setString(1, "Mahir");
            statement.setString(2, "NONIT");

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Employee inserted successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
