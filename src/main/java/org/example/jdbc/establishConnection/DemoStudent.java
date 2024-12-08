package org.example.jdbc.establishConnection;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DemoStudent {
    public static void main(String[] args) throws IOException, SQLException {
        Properties pr=new Properties();
        pr.load(new FileInputStream("config.properties"));
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb",pr);
        Statement st=con.createStatement();
        st.execute("insert into student2 values(18,'john','john@gmail.com')");
        System.out.println("Data inserted sucessfully");
        st.close();
        con.close();
    }
}
