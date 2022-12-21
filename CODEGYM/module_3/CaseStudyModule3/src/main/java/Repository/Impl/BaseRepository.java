package Repository.Impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepository {
    private final String jdbcUrl = "jdbc:mysql://localhost:3306/furama-resort";
    private final String username = "root";
    private final String password = "123456789";
    private Connection connection;

    public BaseRepository() {
    }

    public Connection getConnectionJavaToDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(jdbcUrl, username, password);
            return connection;
        } catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        return null;
    }

}
