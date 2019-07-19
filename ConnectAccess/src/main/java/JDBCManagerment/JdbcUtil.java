package JDBCManagerment;

import java.sql.*;

public class JdbcUtil {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
      // String driverClass = "com.mysql.cj.jdbc.Driver";
        String driverClass = "net.ucanaccess.jdbc.UcanaccessDriver";

        String msAccDB = "database/user.accdb";
        String dbURL = "jdbc:ucanaccess://" + msAccDB;

        Class.forName(driverClass);

     //   Connection connection = DriverManager.getConnection(url, user, password);

        Connection connection = DriverManager.getConnection(dbURL);
        return connection;
    }

    /**
     * @param resultSet
     * @param statement
     * @param connection
     */
    public static void release(ResultSet resultSet, Statement statement, Connection connection){
        if(resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}