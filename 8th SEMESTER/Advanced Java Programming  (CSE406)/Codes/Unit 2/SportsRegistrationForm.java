import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SportsRegistrationForm extends JFrame implements ActionListener {

    private JLabel nameLabel, genderLabel, sportsLabel;
    private JTextField nameField;
    private JComboBox<String> genderComboBox, sportsComboBox;
    private JButton registerButton;

    public SportsRegistrationForm() {
        setTitle("Sports Registration Form");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialize components
        nameLabel = new JLabel("Name:");
        genderLabel = new JLabel("Gender:");
        sportsLabel = new JLabel("Sports:");

        nameField = new JTextField(20);
        
        genderComboBox = new JComboBox<>(new String[]{"Male", "Female", "Other"});
        sportsComboBox = new JComboBox<>(new String[]{"Football", "Basketball", "Tennis", "Swimming"});
        registerButton = new JButton("Register");

        // Add action listener to register button
        registerButton.addActionListener(this);

        // Layout setup
        setLayout(new GridLayout(4, 2));

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(genderLabel);
        add(genderComboBox);
        add(sportsLabel);
        add(sportsComboBox);
        add(registerButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            String name = nameField.getText();
            String gender = (String) genderComboBox.getSelectedItem();
            String sports = (String) sportsComboBox.getSelectedItem();

            // Display message dialog
            JOptionPane.showMessageDialog(this, "Hello Mr/Mrs. " + name + ". You have registered for " + sports + " sports.");
        }
    }

    public static void main(String[] args) {
        new SportsRegistrationForm();
    }
}
