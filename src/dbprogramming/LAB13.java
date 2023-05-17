package dbprogramming;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;
public class LAB13 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "mysql@sit";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = java.sql.DriverManager.getConnection(URL, username, password);
            String sql = "update student set email=? where studentID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"zzzz@gmail.com");
            preparedStatement.setString(2,"111111");
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(LAB12.class.getName()).log(java.util.logging.Level.SEVERE, null, e);

        }catch (SQLException ex){
            Logger.getLogger(LAB12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
