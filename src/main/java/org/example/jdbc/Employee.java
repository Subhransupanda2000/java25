package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","system");
        Statement st=con.createStatement();
        st.execute("insert into student2 values(5,'john','john@gmail.com')");
        System.out.println("Data inserted sucessfully");
        st.close();
        con.close();

    }
}
