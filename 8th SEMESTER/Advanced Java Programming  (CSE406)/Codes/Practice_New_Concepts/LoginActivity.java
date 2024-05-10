import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginActivity extends JFrame {

    private JPanel contentPane;
    private JTextField username;
    private JPasswordField password;

    

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                LoginActivity frame = new LoginActivity();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public LoginActivity() {
        JFrame frame = new JFrame();
        frame.setSize(700, 550);
        frame.setLayout(null);
        frame.getContentPane().setBackground( Color.decode("#429ef5"));
        frame.setLocationRelativeTo(null);

        JLabel heading = new JLabel("Student Management System");
        heading.setBounds(0, 50, 700, 50);
        heading.setHorizontalAlignment(JLabel.CENTER);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 40));
        frame.add(heading);
        
        JLabel loginUsername = new JLabel("Username : ");
        loginUsername.setBounds(175, 130, 150, 50);
        frame.add(loginUsername);
        
        JTextField username = new JTextField();
        username.setBounds(175, 170, 350, 30);
        frame.add(username);
        
        JLabel loginPassword = new JLabel("Password : ");
        loginPassword.setBounds(175, 200, 150, 50);
        frame.add(loginPassword);
        
        JPasswordField password = new JPasswordField();
        password.setBounds(175, 240, 350, 30);
        frame.add(password);

        /*Login section */
        JButton login = new JButton("LOGIN");
        login.setBounds(225, 300, 100, 40);
        frame.add(login);


        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = username.getText();
                String pass = String.valueOf(password.getPassword());

                if (user.isEmpty() || pass.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter both username and password.");
                    return;
                }

               

                try {
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/signup_page_db", "root", "gopi76");
                    PreparedStatement stmt = conn.prepareStatement("SELECT * FROM login WHERE username = ? AND password = ?");
                    stmt.setString(1, user);
                    stmt.setString(2, pass);
                    ResultSet rs = stmt.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Login Successful!");
                        //Menu menuPage = new Menu();
                        //menuPage.setVisible(true);
                        dispose(); // Close the current login page
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect Username or Password.");
                    }
                    conn.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
                }
            }
        });
        login.setFont(new Font("Arial", Font.BOLD, 14));

        JButton signUp = new JButton("SIGNUP");
        signUp.setBounds(375, 300, 100, 40);
        frame.add(signUp);

        signUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to navigate to SignupPage
                ///SignupActivity signupPage = new SignupActivity();
                //signupPage.setVisible(true);
                //dispose(); // Close the current login page
            }
        });

        signUp.setFont(new Font("Arial", Font.BOLD, 14));


        frame.setVisible(true);


        JLabel loginpage = new JLabel("Login");
        loginpage.setBounds(180, 47, 75, 27);
        loginpage.setFont(new Font("Arial", Font.BOLD, 22));
        contentPane.add(loginpage);
        setTitle("Login Form");
        setLocationRelativeTo(null); // Center the frame
        //getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK)); // Add a border
    }
}
