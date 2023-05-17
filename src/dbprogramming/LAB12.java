package dbprogramming;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

public class LAB12 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "mysql@sit";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = java.sql.DriverManager.getConnection(URL, username, password);
            String sql = "Insert into student (studentID,firstName,lastName,email,deptID)"
                    + "values (?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"111111");
            preparedStatement.setString(2,"bbbb");
            preparedStatement.setString(3,"dddd");
            preparedStatement.setString(4,"aaaa@kmutt.ac.th");
            preparedStatement.setString(5,"IT");
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(LAB12.class.getName()).log(java.util.logging.Level.SEVERE, null, e);

        }catch (SQLException ex){
            Logger.getLogger(LAB12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
