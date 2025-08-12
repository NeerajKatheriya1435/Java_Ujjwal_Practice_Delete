import java.sql.*;

public class Delete {
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
            String insertData="insert into employee(id,name,gender,salary,position) values(103,'Abhay','Male',18000.50,'Amazon')";
            int rowsAffected = stmt.executeUpdate(insertData);
            if(rowsAffected>0){
                System.out.println("Data Inserted  "+rowsAffected+" rows affected");
            }else{
                System.out.println("Error while inserting The Data");
            }
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

