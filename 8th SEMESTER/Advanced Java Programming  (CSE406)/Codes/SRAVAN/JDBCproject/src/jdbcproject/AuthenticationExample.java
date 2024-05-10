package jdbcproject;

import java.sql.*;

public class AuthenticationExample {
    public static void main(String[] args) {
        String username = "john";
        String password = "12288293";

        try {
            // Establish connection to the database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","2002");

            // Prepare a statement to query user credentials
            PreparedStatement statement = connection.prepareStatement("SELECT name FROM details WHERE name = ? AND reg_num = ?");
            statement.setString(1, username);
            statement.setString(2, password);

            // Execute the query
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String role = resultSet.getString("name");
                if ("teacher".equals(role)) {
                    // Open teacher interface
                    openTeacherInterface();
                } else if ("student".equals(role)) {
                    // Open student interface
                    openStudentInterface();
                } else {
                    System.out.println("Invalid role!");
                }
            } else {
                System.out.println("Invalid credentials!");
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void openTeacherInterface() {
        // Code to open teacher interface
        System.out.println("Opening teacher interface...");
    }

    private static void openStudentInterface() {
        // Code to open student interface
        System.out.println("Opening student interface...");
    }
}

