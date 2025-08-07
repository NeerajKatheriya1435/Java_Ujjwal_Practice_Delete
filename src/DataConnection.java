import java.sql.*;

public class DataConnection {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/Company";
        String user="root";
        String password="password";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(url,user,password);
            System.out.println("DataBase Connected Successfully");
            Statement stmt = connection.createStatement();
            String query = "SELECT * FROM employee;";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                float salary = rs.getFloat("salary");
                String position = rs.getString("position");
                // Print record
                System.out.println("-------------------------");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Gender: " + gender);
                System.out.println("Salary: " + salary);
                System.out.println("Position: " + position);
                System.out.println("-------------------------");
            }
        } catch (Exception e) {
            System.out.println("Failed to Connect Database: "+e);
        }
    }
}
