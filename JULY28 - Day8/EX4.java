package com.wiproA.mockitodemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EX4 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/company_db", "root", "@Msdhoni7"
            );

            Statement stmt = conn.createStatement();

            String sql = "SELECT * FROM employee";

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("ID | Name | Department");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("emp_name");
                String dept = rs.getString("department");
                System.out.println(id + " | " + name + " | " + dept);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
