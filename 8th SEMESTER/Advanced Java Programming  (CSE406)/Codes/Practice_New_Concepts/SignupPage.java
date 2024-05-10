import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.filechooser.FileNameExtensionFilter;



public class SignupPage extends JFrame {

    private JRadioButton maleRadio;
    private JRadioButton femaleRadio;
    private JRadioButton otherRadio;

    private JLabel titleLabel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JLabel photoLabel;
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JLabel dobLabel;
    private JLabel genderLabel;
    private JLabel emailLabel;
    private JLabel phoneLabel;
    private JLabel registrationLabel;
    private JLabel photoPreviewLabel;
    private JLabel educationLabel;
    private JLabel pdfNameLabel;

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField dobDayField;
    private JTextField dobMonthField;
    private JTextField dobYearField;
    private JTextField institute10thField;
    private JTextField startYear10thField;
    private JTextField endYear10thField;
    private JTextField cgpa10thField;
    private JTextField backlogs10thField;
    private JTextField institute12thField;
    private JTextField startYear12thField;
    private JTextField endYear12thField;
    private JTextField cgpa12thField;
    private JTextField backlogs12thField;
    private JTextField instituteBtechField;
    private JTextField startYearBtechField;
    private JTextField endYearBtechField;
    private JTextField cgpaBtechField;
    private JTextField backlogsBtechField;
    private JTextField emailField;
    private JTextField phoneField;
    private JTextField registrationField;

    private JButton uploadButton, retrieveButton;
    private JButton saveButton;
    private JButton backButton; // Added back button
    
    private byte[] imageBytes;
    private byte[] pdfBytes;
    private File selectedFile;
    
    private JComboBox<String> btechSpecializationComboBox;
    private JComboBox<String> tenthSpecializationComboBox; // Declare JComboBox for 10th specialization
    private JComboBox<String> twelfthSpecializationComboBox; // Declare JComboBox for 12th specialization



    public SignupPage() {
        setTitle("Signup Page");
        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(240, 248, 255));


        titleLabel = new JLabel("Signup Page");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setBounds(250, 10, 200, 30);
        add(titleLabel);

        usernameLabel = new JLabel(" Username* :");
        usernameLabel.setBounds(50, 50, 100, 20);
        add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(160, 50, 200, 20);
        add(usernameField);

        passwordLabel = new JLabel(" Password* :");
        passwordLabel.setBounds(50, 80, 100, 20);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(160, 80, 200, 20);
        add(passwordField);

        photoLabel = new JLabel("Upload Photo* :");
        photoLabel.setBounds(520, 50, 100, 20);
        add(photoLabel);

        photoPreviewLabel = new JLabel();
        photoPreviewLabel.setBounds(630, 50, 200, 200);
        photoPreviewLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(photoPreviewLabel);

        uploadButton = new JButton("Upload");
        uploadButton.setBounds(635, 270, 90, 20);
        uploadButton.setForeground(Color.WHITE);
        uploadButton.setBackground(new Color(59, 89, 182));
        add(uploadButton);
        
        retrieveButton = new JButton("Remove");
        retrieveButton.setBounds(735, 270, 90, 20);
        retrieveButton.setForeground(Color.WHITE);
        retrieveButton.setBackground(new Color(59, 89, 182));
        add(retrieveButton);

        uploadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    selectedFile = fileChooser.getSelectedFile();
                    try {
                        displaySelectedImage(selectedFile);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        
        retrieveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                // Nullify the photoPreviewLabel
            	
            	photoPreviewLabel.setIcon(null);
            }
        });


        firstNameLabel = new JLabel(" First Name* :");
        firstNameLabel.setBounds(50, 110, 100, 20);
        add(firstNameLabel);

        firstNameField = new JTextField();
        firstNameField.setBounds(160, 110, 200, 20);
        add(firstNameField);

        lastNameLabel = new JLabel(" Last Name* :");
        lastNameLabel.setBounds(50, 140, 100, 20);
        add(lastNameLabel);

        lastNameField = new JTextField();
        lastNameField.setBounds(160, 140, 200, 20);
        add(lastNameField);

        dobLabel = new JLabel(" Date of Birth* :");
        dobLabel.setBounds(50, 170, 100, 20);
        add(dobLabel);

        dobDayField = new JTextField("DD", 2);
        dobDayField.setBounds(160, 170, 40, 20);
        add(dobDayField);

        dobMonthField = new JTextField("MM", 2);
        dobMonthField.setBounds(210, 170, 40, 20);
        add(dobMonthField);

        dobYearField = new JTextField("YYYY", 4);
        dobYearField.setBounds(260, 170, 60, 20);
        add(dobYearField);

        genderLabel = new JLabel(" Gender* :");
        genderLabel.setBounds(50, 200, 100, 20);
        add(genderLabel);

        maleRadio = new JRadioButton("Male");
        maleRadio.setBounds(160, 200, 60, 20);
        femaleRadio = new JRadioButton("Female");
        femaleRadio.setBounds(220, 200, 70, 20);
        otherRadio = new JRadioButton("Other");
        otherRadio.setBounds(290, 200, 60, 20);
        ButtonGroup genderGroup = new ButtonGroup();
         maleRadio.setBackground(new Color(240, 248, 255)); // Light blue color
        femaleRadio.setBackground(new Color(240, 248, 255)); // Light blue color
        otherRadio.setBackground(new Color(240, 248, 255)); // Light blue color
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        genderGroup.add(otherRadio);
        add(maleRadio);
        add(femaleRadio);
        add(otherRadio);

        emailLabel = new JLabel(" Email* :");
        emailLabel.setBounds(50, 230, 100, 20);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(160, 230, 200, 20);
        add(emailField);

     // Phone components
        phoneLabel = new JLabel(" Phone* :");
        phoneLabel.setBounds(50, 260, 100, 20);
        add(phoneLabel);
        phoneField = new JTextField();
        phoneField.setBounds(160, 260, 200, 20);
        add(phoneField);

        JLabel nationalityLabel = new JLabel("Nationality:");
        nationalityLabel.setBounds(50, 290, 100, 20); // Adjust position as needed
        add(nationalityLabel);

        JRadioButton indianRadio = new JRadioButton("Indian");
        indianRadio.setBounds(180, 290, 80, 20); // Adjust position and size as needed
        add(indianRadio);

        JRadioButton internationalRadio = new JRadioButton("International");
        internationalRadio.setBounds(280, 290, 120, 20); // Adjust position and size as needed
        add(internationalRadio);

        ButtonGroup nationalityGroup = new ButtonGroup();
        // Set the background color for each radio button
indianRadio.setBackground(new Color(240, 248, 255)); // Light blue color
internationalRadio.setBackground(new Color(240, 248, 255)); // Light blue color

// Add radio buttons to the button group
nationalityGroup.add(indianRadio);
nationalityGroup.add(internationalRadio);


        // Permanent Address
        JLabel permanentAddressLabel = new JLabel("Permanent Address* :");
        permanentAddressLabel.setBounds(50, 320, 150, 20); // Adjust position as needed
        add(permanentAddressLabel);

        JTextField permanentAddressField = new JTextField();
        permanentAddressField.setBounds(190, 320, 200, 20); // Adjust position and size as needed
        add(permanentAddressField);

        // Pincode
        JLabel pincodeLabel = new JLabel("Pincode* :");
        pincodeLabel.setBounds(400, 320, 100, 20); // Adjust position as needed
        add(pincodeLabel);

        JTextField pincodeField = new JTextField();
        pincodeField.setBounds(470, 320, 100, 20); // Adjust position and size as needed
        add(pincodeField);


        registrationLabel = new JLabel(" Registration No* :");
        registrationLabel.setBounds(50, 350, 150, 20);
        add(registrationLabel);

        registrationField = new JTextField();
        registrationField.setBounds(200, 350, 200, 20);
        add(registrationField);

        educationLabel = new JLabel(" Education* :");
        educationLabel.setBounds(50, 380, 100, 20);
        add(educationLabel);

        JLabel education10thLabel = new JLabel("10th School Name:");
        education10thLabel.setBounds(50, 410, 120, 20); 
        add(education10thLabel);

        institute10thField = new JTextField();
        institute10thField.setBounds(180, 410, 150, 20); 
        add(institute10thField);

        // Define 10th specialization options
        String[] tenthSpecializationOptions = {"SSC", "CBSE", "Others"};

        // Initialize JComboBox with 10th specialization options
        tenthSpecializationComboBox = new JComboBox<>(tenthSpecializationOptions);
        tenthSpecializationComboBox.setBounds(360, 410, 150, 20); // Adjust position and size as needed
        add(tenthSpecializationComboBox);

        JLabel startYear10thLabel = new JLabel("Start Year:");
        startYear10thLabel.setBounds(520, 410, 80, 20); 
        add(startYear10thLabel);

        startYear10thField = new JTextField();
        startYear10thField.setBounds(610, 410, 80, 20); 
        add(startYear10thField);

        JLabel endYear10thLabel = new JLabel("End Year:");
        endYear10thLabel.setBounds(700, 410, 80, 20); 
        add(endYear10thLabel);

        endYear10thField = new JTextField();
        endYear10thField.setBounds(790, 410, 80, 20); 
        add(endYear10thField);

        JLabel cgpa10thLabel = new JLabel("CGPA:");
        cgpa10thLabel.setBounds(880, 410, 60, 20); 
        add(cgpa10thLabel);

        cgpa10thField = new JTextField();
        cgpa10thField.setBounds(940, 410, 60, 20); 
        add(cgpa10thField);

        JLabel backlogs10thLabel = new JLabel("Backlogs:");
        backlogs10thLabel.setBounds(1020, 410, 80, 20); 
        add(backlogs10thLabel);

        backlogs10thField = new JTextField();
        backlogs10thField.setBounds(1100, 410, 100, 20); 
        add(backlogs10thField);

        // Similar adjustments for 12th education fields
        JLabel education12thLabel = new JLabel("12th School Name:");
        education12thLabel.setBounds(50, 440, 120, 20); 
        add(education12thLabel);

        institute12thField = new JTextField();
        institute12thField.setBounds(180, 440, 150, 20); 
        add(institute12thField);

        // Define 12th specialization options
        String[] twelfthSpecializationOptions = {"MPC", "BIPC", "IB", "Others"};

        // Initialize JComboBox with 12th specialization options
        twelfthSpecializationComboBox = new JComboBox<>(twelfthSpecializationOptions);
        twelfthSpecializationComboBox.setBounds(360, 440, 150, 20); // Adjust position and size as needed
        add(twelfthSpecializationComboBox);

        JLabel startYear12thLabel = new JLabel("Start Year:");
        startYear12thLabel.setBounds(520, 440, 80, 20); 
        add(startYear12thLabel);

        startYear12thField = new JTextField();
        startYear12thField.setBounds(610, 440, 80, 20); 
        add(startYear12thField);

        JLabel endYear12thLabel = new JLabel("End Year:");
        endYear12thLabel.setBounds(700, 440, 80, 20); 
        add(endYear12thLabel);

        endYear12thField = new JTextField();
        endYear12thField.setBounds(790, 440, 80, 20); 
        add(endYear12thField);

        JLabel cgpa12thLabel = new JLabel("CGPA:");
        cgpa12thLabel.setBounds(880, 440, 60, 20); 
        add(cgpa12thLabel);

        cgpa12thField = new JTextField();
        cgpa12thField.setBounds(940, 440, 60, 20); 
        add(cgpa12thField);

        JLabel backlogs12thLabel = new JLabel("Backlogs:");
        backlogs12thLabel.setBounds(1020, 440, 80, 20); 
        add(backlogs12thLabel);

        backlogs12thField = new JTextField();
        backlogs12thField.setBounds(1100, 440, 100, 20); 
        add(backlogs12thField);


        JLabel instituteBtechLabel = new JLabel("Institute B.Tech:");
        instituteBtechLabel.setBounds(50, 470, 100, 20); // Adjust position as needed
        add(instituteBtechLabel);

        instituteBtechField = new JTextField();
        instituteBtechField.setBounds(180, 470, 150, 20); // Adjust position and size as needed
        add(instituteBtechField);

        // Define B.Tech specialization options
        String[] specializationOptions = {"CSE", "ECE", "EEE", "Civil", "Mechanical", "IT", "Others"};

        // Initialize JComboBox with specialization options
        btechSpecializationComboBox = new JComboBox<>(specializationOptions);
        btechSpecializationComboBox.setBounds(360, 470, 150, 20); // Adjust position and size as needed
        add(btechSpecializationComboBox);

        JLabel startYearBtechLabel = new JLabel("Start Year:");
        startYearBtechLabel.setBounds(520, 470, 80, 20); // Adjust position as needed
        add(startYearBtechLabel);

        startYearBtechField = new JTextField();
        startYearBtechField.setBounds(610, 470, 80, 20); // Adjust position and size as needed
        add(startYearBtechField);

        JLabel endYearBtechLabel = new JLabel("End Year:");
        endYearBtechLabel.setBounds(700, 470, 80, 20); // Adjust position as needed
        add(endYearBtechLabel);

        endYearBtechField = new JTextField();
        endYearBtechField.setBounds(790, 470, 80, 20); // Adjust position and size as needed
        add(endYearBtechField);

        JLabel cgpaBtechLabel = new JLabel("CGPA:");
        cgpaBtechLabel.setBounds(880, 470, 60, 20); // Adjust position as needed
        add(cgpaBtechLabel);

        cgpaBtechField = new JTextField();
        cgpaBtechField.setBounds(940, 470, 60, 20); // Adjust position and size as needed
        add(cgpaBtechField);

        JLabel backlogsBtechLabel = new JLabel("Backlogs:");
        backlogsBtechLabel.setBounds(1020, 470, 80, 20); // Adjust position as needed
        add(backlogsBtechLabel);

        backlogsBtechField = new JTextField();
        backlogsBtechField.setBounds(1100, 470, 100, 20); // Adjust position and size as needed
        add(backlogsBtechField);

        saveButton = new JButton("Submit");
        saveButton.setBounds(510, 600, 100, 30);
        saveButton.setForeground(Color.WHITE);
        saveButton.setBackground(new Color(59, 89, 182));
        add(saveButton);
        
        backButton = new JButton("Back");
        backButton.setBounds(380, 600, 100, 30);
        backButton.setForeground(Color.WHITE);
        backButton.setBackground(new Color(59, 89, 182));
        add(backButton);

        JButton pdfUploadButton = new JButton("Upload PDF");
        pdfUploadButton.setBounds(520, 500, 120, 30);
        pdfUploadButton.setForeground(Color.WHITE);
        pdfUploadButton.setBackground(new Color(59, 89, 182));
        add(pdfUploadButton);

        pdfNameLabel = new JLabel();
        pdfNameLabel.setBounds(450, 500, 200, 100);
        add(pdfNameLabel);

        pdfUploadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF Files", "pdf");
                fileChooser.setFileFilter(filter);
                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    selectedFile = fileChooser.getSelectedFile(); // Assign selected file to selectedFile variable
                    pdfNameLabel.setText(selectedFile.getName()); // Set the name of the selected file
                }
            }
        });
        
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close the current window
            	//Menu menu = new Menu();
            	//menu.setVisible(true);
                //dispose();
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	if (selectedFile != null) {
                    uploadImageToDatabase(selectedFile);
                } else {
                    JOptionPane.showMessageDialog(null, "Please select an image to upload.");
                }
            }
        });
        setLayout(null);
        setVisible(true);
    }
    
    

    private String getSelectedGender() {
        if (maleRadio.isSelected()) {
            return "Male";
        } else if (femaleRadio.isSelected()) {
            return "Female";
        } else if (otherRadio.isSelected()) {
            return "Other";
        } else {
            return "";
        }
    }
    
   

    private void displaySelectedImage(File file) throws Exception {
        ImageIcon imageIcon = new ImageIcon(file.getAbsolutePath());
        Image img = imageIcon.getImage();
        Image scaledImg = img.getScaledInstance(photoPreviewLabel.getWidth(), photoPreviewLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImg);
        photoPreviewLabel.setIcon(scaledImageIcon);
    }
    
    private void uploadImageToDatabase(File file) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/signup_page_db", "root", "1234");
             FileInputStream fis = new FileInputStream(file)) {  // Use try-with-resources for FileInputStream
           
            String sql = "INSERT INTO users (username, password, first_name, last_name, dob_day, dob_month, dob_year, gender, email, phone, registration_number, " +
                         "institute_10th, start_year_10th, end_year_10th, cgpa_10th, backlogs_10th, " +
                         "institute_12th, start_year_12th, end_year_12th, cgpa_12th, backlogs_12th, " +
                         "institute_btech, start_year_btech, end_year_btech, cgpa_btech, backlogs_btech, " +
                         "image_data, pdf_data, specialization_10th, specialization_12th, specialization_btech) " +
                         "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                String username = usernameField.getText();
                String password = String.valueOf(passwordField.getPassword());
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                
                String dobDay = dobDayField.getText();
                String dobMonth = dobMonthField.getText();
                String dobYear = dobYearField.getText();

                int day = Integer.parseInt(dobDay);
                int month = Integer.parseInt(dobMonth);
                int year = Integer.parseInt(dobYear);

                String gender = getSelectedGender();

                String email = emailField.getText();
                String phone = phoneField.getText();

                String registrationNumber = registrationField.getText();

                String school10th = institute10thField.getText();
                String startYear10th = startYear10thField.getText();
                String endYear10th = endYear10thField.getText();
                String cgpa10th = cgpa10thField.getText();
                String backlogs10th = backlogs10thField.getText();

                String school12th = institute12thField.getText();
                String startYear12th = startYear12thField.getText();
                String endYear12th = endYear12thField.getText();
                String cgpa12th = cgpa12thField.getText();
                String backlogs12th = backlogs12thField.getText();

                String collegeBtech = instituteBtechField.getText();
                String startYearBtech = startYearBtechField.getText();
                String endYearBtech = endYearBtechField.getText();
                String cgpaBtech = cgpaBtechField.getText();
                String backlogsBtech = backlogsBtechField.getText();
                
                String tenthSpecialization = (String) tenthSpecializationComboBox.getSelectedItem();
                String twelfthSpecialization = (String) twelfthSpecializationComboBox.getSelectedItem();
                String btechSpecialization = (String) btechSpecializationComboBox.getSelectedItem();

                byte[] imageBytes = Files.readAllBytes(file.toPath());  // Read image file into a byte array
                
                byte[] pdfBytes = null;
                if (selectedFile != null) {
                    pdfBytes = Files.readAllBytes(selectedFile.toPath());  // Read PDF file into a byte array
                }

                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                preparedStatement.setString(3, firstName);
                preparedStatement.setString(4, lastName);
                preparedStatement.setInt(5, day);
                preparedStatement.setInt(6, month);
                preparedStatement.setInt(7, year);
                preparedStatement.setString(8, gender);
                preparedStatement.setString(9, email);
                preparedStatement.setString(10, phone);
                preparedStatement.setString(11, registrationNumber);
                preparedStatement.setString(12, school10th);
                preparedStatement.setString(13, startYear10th);
                preparedStatement.setString(14, endYear10th);
                preparedStatement.setString(15, cgpa10th);
                preparedStatement.setString(16, backlogs10th);
                preparedStatement.setString(17, school12th);
                preparedStatement.setString(18, startYear12th);
                preparedStatement.setString(19, endYear12th);
                preparedStatement.setString(20, cgpa12th);
                preparedStatement.setString(21, backlogs12th);
                preparedStatement.setString(22, collegeBtech);
                preparedStatement.setString(23, startYearBtech);
                preparedStatement.setString(24, endYearBtech);
                preparedStatement.setString(25, cgpaBtech);
                preparedStatement.setString(26, backlogsBtech);
                preparedStatement.setBinaryStream(27, fis, (int) file.length()); // Set image data
                preparedStatement.setBytes(28, pdfBytes); // Set PDF data
                preparedStatement.setString(29, tenthSpecialization);
                preparedStatement.setString(30, twelfthSpecialization);
                preparedStatement.setString(31, btechSpecialization);

                preparedStatement.executeUpdate();

                JOptionPane.showMessageDialog(null, "User registered successfully!");
                
             // Reset text fields to empty strings
                usernameField.setText("");
                passwordField.setText("");
                firstNameField.setText("");
                lastNameField.setText("");
                dobDayField.setText("");
                dobMonthField.setText("");
                dobYearField.setText("");
                emailField.setText("");
                phoneField.setText("");
                registrationField.setText("");
                institute10thField.setText("");
                startYear10thField.setText("");
                endYear10thField.setText("");
                cgpa10thField.setText("");
                backlogs10thField.setText("");
                institute12thField.setText("");
                startYear12thField.setText("");
                endYear12thField.setText("");
                cgpa12thField.setText("");
                backlogs12thField.setText("");
                instituteBtechField.setText("");
                startYearBtechField.setText("");
                endYearBtechField.setText("");
                cgpaBtechField.setText("");
                backlogsBtechField.setText("");

                // Reset combo boxes to default selection
                tenthSpecializationComboBox.setSelectedIndex(0);
                twelfthSpecializationComboBox.setSelectedIndex(0);
                btechSpecializationComboBox.setSelectedIndex(0);

                // Reset image and PDF fields
                photoPreviewLabel.setIcon(null);
                pdfNameLabel.setText("");
                
                
                //Menu menu = new Menu();
                //menu.setVisible(true);
                //dispose(); 
                
                /*try (Connection anotherConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_images", "root", "gopi76");
                        PreparedStatement anotherPreparedStatement = anotherConnection.prepareStatement("INSERT INTO myimages (Image, registration_Number) VALUES (?, ?)")) {
                       
                       // Create a new FileInputStream to read the image data again
                       try (FileInputStream fis2 = new FileInputStream(file)) {
                           // Set image data for the other database
                           anotherPreparedStatement.setBinaryStream(1, fis2, (int) file.length());
                           anotherPreparedStatement.setString(2, registrationField.getText());
                           
                           // Execute insertion into the other database
                           anotherPreparedStatement.executeUpdate();
                       } catch (IOException ex) {
                           ex.printStackTrace();
                           JOptionPane.showMessageDialog(null, "Error occurred while saving image to another database.");
                       }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error occurred while saving image to another database.");
                }*/

                SwingUtilities.invokeLater(Menu::new);
            }
        } catch (SQLException | IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while registering user.");
        }
    }


   



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SignupPage updateStudent = new SignupPage();
                updateStudent.setVisible(true);
            }
        });
    }
}
