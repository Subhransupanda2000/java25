package org.example.jdbc.createStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) throws SQLException {
        Scanner sc=new Scanner(System.in);
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","system");
        PreparedStatement ps=con.prepareStatement("insert into student2 values(?,?,?)");
        ps.setInt(1,sc.nextInt());
        ps.setString(2,sc.next());
        ps.setString(3,sc.next());
        ps.executeUpdate();
        ps.close();
        con.close();
        System.out.println("data inserted");

    }
}
