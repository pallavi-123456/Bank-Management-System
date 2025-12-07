package src.bankmanagement;
import java.sql.*;

public class Connn {
    Connection connection;
    Statement statement;

    public Connn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // Updated driver
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "");
            statement = connection.createStatement();   // IMPORTANT!
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Connn();  
}
}
