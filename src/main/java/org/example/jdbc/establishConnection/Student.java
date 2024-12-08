package org.example.jdbc.establishConnection;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?user=root&password=system");
        Statement st=con.createStatement();
        st.execute("insert into student2 values(10,'john','john@gmail.com')");
        System.out.println("Data inserted sucessfully");
        st.close();
        con.close();
    }
}
