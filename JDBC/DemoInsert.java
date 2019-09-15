package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoInsert
{
    public static void main(String[] args)
    {
        Connection con= DBConnection.getConnection();
        try
        {
            String query = "Insert into employee values(5,'akhangal',4000)";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}
