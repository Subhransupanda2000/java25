package org.example.jdbc.callableStatement;

import java.sql.*;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "system");
             CallableStatement cs = con.prepareCall("{CALL insertStudent(?, ?, ?)}")) {

            // Get input from the user
            System.out.print("Enter ID: ");
            cs.setInt(1, sc.nextInt());
            System.out.print("Enter Name: ");
            cs.setString(2, sc.next());
            System.out.print("Enter Email: ");
            cs.setString(3, sc.next());

            // Execute the stored procedure
            cs.executeUpdate();

            System.out.println("Data inserted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
