package cloudserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySqlConnection {

    Connection connection;

    public Connection getMySQLConnection() throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/idea";
        String user = "root";
        String password = "root";

        Class.forName(driver);
        connection = DriverManager.getConnection(url, user, password);
        System.out.println("Connection Done");
        return connection;

    }

    public void closeConnection()
    {
        try {
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
