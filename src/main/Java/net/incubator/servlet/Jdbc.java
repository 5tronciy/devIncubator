package net.incubator.servlet; /**
 * Created by Stronciy on 30.08.2020.
 */
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class Jdbc {
    /**
     * JDBC Driver and database url
     */
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/dev?useSSL=false";

    /**
     * net.incubator.servlet.User and Password
     */
    static final String USER = "root";
    static final String PASSWORD = "glzsoi409bmF.da3";

    public static User getUsersdatatableByUserid(int userid) throws ClassNotFoundException, SQLException {
        User user;
        user=null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        System.out.println("Registering JDBC driver...");
        Class.forName(JDBC_DRIVER);
        System.out.println("Creating connection...");
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        try {
            String SQL = "SELECT * FROM `user` WHERE `userid`=?;";
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, userid);
            System.out.println("Querying..."+preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                user = new User(userid, resultSet.getString("name"), resultSet.getString("sureName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if(connection!=null){
                connection.close();
            }
            return user;
        }
    }

    public static List<Account> getAllAccounts() throws ClassNotFoundException, SQLException {
        List<Account> result = new LinkedList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        System.out.println("Registering JDBC driver...");
        Class.forName(JDBC_DRIVER);
        System.out.println("Creating connection...");
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        System.out.println("Retrieving list of Accounts...");
        try {
            String SQL = "SELECT * FROM account;";
            Statement statement = connection.prepareStatement(SQL);
            ResultSet resultSet = statement.executeQuery(SQL);
            while (resultSet.next()) {
                int accountid = resultSet.getInt("accountid");
                int account = resultSet.getInt("account");
                int userid = resultSet.getInt("userid");
                result.add(new Account(accountid, account, userid));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if(connection!=null){
                connection.close();
            }
            return result;
        }
    }
}