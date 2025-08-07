import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FilesDataBase {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/Company";
        String user="root";
        String password="password";

        try {
            Connection connection= DriverManager.getConnection(url,user,password);
            System.out.println("DataBase Connected Successfully");
        } catch (SQLException e) {
            System.out.println("Failed to Connect Database: "+e);
        }
    }
}
