package dbprogramming;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB9 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "mysql@sit";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, username, password);
             Statement statement = connection.createStatement();
            String sql = "Insert into student (studentID,firstName,lastName,email,deptID)"
                + "values ('651045','Pongsapat','Charoencharuskul','aaaa@kmutt.ac.th','IT')";
            statement.executeUpdate(sql);
        }catch (ClassNotFoundException | SQLException ex){
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}