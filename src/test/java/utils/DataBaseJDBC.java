package utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class DataBaseJDBC {

    public Connection conn;
    public Statement stmt;

    public DataBaseJDBC() throws SQLException {

        conn = DriverManager.
                getConnection("jdbc:mysql://localhost:3306/test", "root", "Winter2018");
    }

    public DataBaseJDBC(String url, String username, String password) throws SQLException {
        conn = DriverManager.getConnection(url, username, password);
    }


    public void getData(String query) throws SQLException {
        stmt = conn.createStatement();
        ResultSet data = stmt.executeQuery(query);
        ResultSetMetaData metadata = data.getMetaData();
        int columnCount = metadata.getColumnCount();

        //System.out.println(data);
        while (data.next()) {

            String row = "";
            for (int i = 1; i <= columnCount; i++) {
                row += data.getString(i) + ", ";
            }
            System.out.println(row);
            //System.out.println(data.getString(1)+" "+data.getString(2)+" "+data.getString(3));
            System.out.println("===========================================");

        }
    }

    public void insertData(String query) throws SQLException {
        stmt = conn.createStatement();
        stmt.execute(query);

    }

    public void updateData(String query) throws SQLException {
        stmt = conn.createStatement();
        stmt.executeUpdate(query);

    }

    public void deleteData(String query) throws SQLException {
        stmt = conn.createStatement();
        stmt.executeUpdate(query);
    }

    public ResultSet getResultSet(String query) throws SQLException {
        stmt = conn.createStatement();
        ResultSet data = stmt.executeQuery(query);
        return data;
    }
}
