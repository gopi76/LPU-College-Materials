import javax.swing.*;
import java.awt.event.*;

public class SportsRegistrationForm1 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Registration Form");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 20, 100, 25);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 60, 100, 25);

        JLabel sportsLabel = new JLabel("Sports:");
        sportsLabel.setBounds(50, 100, 100, 25);

        
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 20, 250, 25);

        
        ButtonGroup genderGroup = new ButtonGroup();
        JRadioButton maleButton = new JRadioButton("Male");

        maleButton.setBounds(150, 60, 80, 25);
        JRadioButton femaleButton = new JRadioButton("Female");

        femaleButton.setBounds(230, 60, 80, 25);
        JRadioButton otherButton = new JRadioButton("Other");

        otherButton.setBounds(310, 60, 80, 25);

        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderGroup.add(otherButton);

        
        JCheckBox footballCheckbox = new JCheckBox("Football");
        footballCheckbox.setBounds(150, 100, 100, 25);

        JCheckBox basketballCheckbox = new JCheckBox("Basketball");
        basketballCheckbox.setBounds(250, 100, 100, 25);

        JCheckBox tennisCheckbox = new JCheckBox("Tennis");
        tennisCheckbox.setBounds(150, 130, 100, 25);

        JCheckBox cricketCheckbox = new JCheckBox("Cricket");
        cricketCheckbox.setBounds(250, 130, 100, 25);

        
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(180, 180, 100, 40);

        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 400, 300); 
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(genderLabel);
        panel.add(maleButton);
        panel.add(femaleButton);
        panel.add(otherButton);
        panel.add(sportsLabel);
        panel.add(footballCheckbox);
        panel.add(basketballCheckbox);
        panel.add(tennisCheckbox);
        panel.add(cricketCheckbox);
        panel.add(submitButton);

        
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String gender = "";
                if (maleButton.isSelected()) {
                    gender = "Male";
                } else if (femaleButton.isSelected()) {
                    gender = "Female";
                } else {
                    gender = "Other";
                }

                String sports = "";
                if (footballCheckbox.isSelected()) {
                    sports += "Football, ";
                }
                if (basketballCheckbox.isSelected()) {
                    sports += "Basketball, ";
                }
                if (tennisCheckbox.isSelected()) {
                    sports += "Tennis";
                }
                if (cricketCheckbox.isSelected()) {
                    sports += "Cricket";
                }

                if (sports.length() > 0) {
                    sports = sports.substring(0, sports.length() - 2);
                }

                JOptionPane.showMessageDialog(frame,
                        "Name: " + name + "\n" +
                                "Gender: " + gender + "\n" +
                                "Sports: " + sports + "\n\n" +
                                "Registration successful!");
            }
        });

        frame.setLayout(null);
        frame.add(panel);
        frame.setVisible(true);
    }
}
