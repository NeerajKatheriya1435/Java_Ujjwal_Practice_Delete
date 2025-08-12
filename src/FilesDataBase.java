import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class FilesDataBase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String url="jdbc:mysql://localhost:3306/Company";
        String user="root";
        String password="password";

        try {
            Connection connection= DriverManager.getConnection(url,user,password);
            System.out.println("DataBase Connected Successfully");

            // Create Data
            String sql = "INSERT INTO employee (id,name,gender,salary,position) VALUES (?,?,?,?,?)";
            System.out.println("Enter your id");
            int myId=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter your name");
            String myName=sc.nextLine();
            System.out.println("Enter your gender");
            String myGender=sc.nextLine();
            System.out.println("Enter your salary");
            Double mySalary=sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter your position");
            String myPosition=sc.nextLine();

            PreparedStatement pstmt=connection.prepareStatement(sql);
            pstmt.setInt(1,myId);
            pstmt.setString(2,myName);
            pstmt.setString(3,myGender);
            pstmt.setDouble(4,mySalary);
            pstmt.setString(5,myPosition);

            int rows = pstmt.executeUpdate();
            System.out.println(rows + " record(s) inserted.");

        } catch (Exception e) {
            System.out.println("Failed to Connect Database: "+e.getMessage());
        }
    }
}
