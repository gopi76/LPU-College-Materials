package cse406;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/Students";
        String dbUsername = "root";
        String dbPassword = "@Abhishek123";

        // Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String usernameInput = scanner.nextLine();

        System.out.print("Enter password: ");
        String initialPassword = scanner.nextLine();

        
        String insertQuery = "INSERT INTO users (username, password) VALUES (?, ?)";

       
        String updateQuery = "UPDATE users SET password = ? WHERE username = ?";

        try {
            // Establishing a connection to the database
            Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);

            // Creating a prepared statement for insertion
            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
            insertStatement.setString(1, usernameInput);
            insertStatement.setString(2, initialPassword);

            // Executing the SQL query to insert new user
            int rowsInserted = insertStatement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("User created successfully.");
            } else {
                System.out.println("Failed to create user.");
            }

            // Creating a prepared statement for password update
            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);

            // Get new password from the user
            System.out.print("Enter new password: ");
            String newPassword = scanner.nextLine();

            // Setting parameters for the update query
            updateStatement.setString(1, newPassword);
            updateStatement.setString(2, usernameInput);

            // Executing the SQL query to change the password
            int rowsAffected = updateStatement.executeUpdate();

            // Checking if the password was successfully updated
            if (rowsAffected > 0) {
                System.out.println("Password changed successfully.");
            } else {
                System.out.println("Failed to change password.");
            }

            // Closing resources
            insertStatement.close();
            updateStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
