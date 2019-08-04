package database.TestNG;

import java.sql.*;

public class testNG {
    public static void main(String[] args) {
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
                    "root", "Winter2018");

            Statement st = connect.createStatement();


            ResultSet rs= st.executeQuery("select * from test.customer");
            while(rs.next()) {
                System.out.println(rs.getString(1)+ " "+rs.getString(2) +
                        " " + rs.getString(3) + " " + rs.getString(4));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



