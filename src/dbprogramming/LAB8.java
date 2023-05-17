package dbprogramming;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB8 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "mysql@sit";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection connection= DriverManager.getConnection(URL, username, password);
            System.out.println("Database connected");
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM student";
            ResultSet result = statement.executeQuery(sql);

            while (result.next()){
                System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4)+" "+result.getString(5));
            }
        }catch(ClassNotFoundException ex){
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex){
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

}
