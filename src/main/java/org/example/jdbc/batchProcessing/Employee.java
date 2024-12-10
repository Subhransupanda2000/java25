package org.example.jdbc.batchProcessing;

import java.sql.*;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "system");

            ps = con.prepareStatement("INSERT INTO student (id, name, email) VALUES (?, ?, ?)");

            ps.setInt(1, 2);
            ps.setString(2, "jhjdb");
            ps.setString(3, "gjhfhd");
            ps.addBatch();

            int[] results = ps.executeBatch();

            for (int result : results) {
                System.out.println("Rows affected: " + result);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
