package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class JDBCchallenge {
    public static void main(String[] args){
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "2002");
            
            PreparedStatement ps = con.prepareStatement("SELECT * FROM details");
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String name = rs.getString("name");
                String regNo = rs.getString("reg_num");
                String email = rs.getString("email");
                String gender = rs.getString("gender");
                String city = rs.getString("city");
                
                System.out.println("Name: " + name);
                System.out.println("Reg No: " + regNo);
                System.out.println("Email: " + email);
                System.out.println("Gender: " + gender);
                System.out.println("City: " + city);
                System.out.println();
            }
            
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
