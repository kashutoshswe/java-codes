package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DBConnection
{
        static Connection getConnection()
        {
            Connection connection=null;
            try
            {
                String driver = "com.mysql.cj.jdbc.Driver" ;
                Class.forName(driver);

                String url="jdbc:mysql://localhost:3306/java" ;

                String user="root";
                String password = "MyNewPass4!";


                connection= DriverManager.getConnection(url,user,password);
                if(connection !=null)
                    System.out.println("Connected !");
                else
                    System.out.println("Not Connected");

            }
            catch (ClassNotFoundException | SQLException e)
            {
                e.printStackTrace();
            }
            return connection;
        }
}
