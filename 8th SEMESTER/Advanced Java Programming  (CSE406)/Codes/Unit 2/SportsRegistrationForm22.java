import javax.swing.*;
import java.awt.event.*;

public class SportsRegistrationForm22 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Registration Form");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
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

        JCheckBox hockeyCheckbox = new JCheckBox("Hockey");
        hockeyCheckbox.setBounds(150, 160, 100, 25);

        JCheckBox volleyCheckbox = new JCheckBox("Volleyball");
        volleyCheckbox.setBounds(250, 160, 100, 25);



        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(190, 190, 100, 40);

        //JTextArea outputTextArea = new JTextArea();
        //outputTextArea.setBounds(50, 240, 350, 150);
        //outputTextArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 500, 500);

        panel.add(nameLabel); panel.add(nameField);

        panel.add(genderLabel); panel.add(maleButton); panel.add(femaleButton);  panel.add(otherButton);
        
        panel.add(sportsLabel);
        panel.add(footballCheckbox); panel.add(basketballCheckbox);
        panel.add(tennisCheckbox);  panel.add(cricketCheckbox);
        panel.add(hockeyCheckbox);  panel.add(volleyCheckbox);

        panel.add(submitButton);
        //panel.add(outputTextArea);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String gender = "";

                if (!maleButton.isSelected() && !femaleButton.isSelected() && !otherButton.isSelected()) {
                    JOptionPane.showMessageDialog(frame, "Please select a gender!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (maleButton.isSelected()) {
                    gender = "Male";
                } else if (femaleButton.isSelected()) {
                    gender = "Female";
                } else {
                    gender = "Other";
                }

                StringBuilder sports = new StringBuilder();

                if (footballCheckbox.isSelected()) {
                    sports.append("Football, ");
                }
                if (basketballCheckbox.isSelected()) {
                    sports.append("Basketball, ");
                }
                if (tennisCheckbox.isSelected()) {
                    sports.append("Tennis, ");
                }
                if (cricketCheckbox.isSelected()) {
                    sports.append("Cricket, ");
                }
                if(hockeyCheckbox.isSelected()) {
                    sports.append("Hockey, ");
                }
                if (volleyCheckbox.isSelected()) {
                    sports.append("Volleyball, ");
                }


                if (sports.length() > 0) {
                    sports.setLength(sports.length() - 2); 
                }

                JOptionPane.showMessageDialog(frame,
                        "Name: " + name + "\n" +
                                "Gender: " + gender + "\n" +
                                "Sports: " + sports + "\n\n" +
                                "Registration successful!");

                /*outputTextArea.setText("User Name : " + name + "\n" +
                        "Gender : " + gender + "\n" +
                        "Sports : " + sports.toString());*/

            }
        });


        frame.setLayout(null);
        frame.add(panel);
        frame.setVisible(true);

    }
}
