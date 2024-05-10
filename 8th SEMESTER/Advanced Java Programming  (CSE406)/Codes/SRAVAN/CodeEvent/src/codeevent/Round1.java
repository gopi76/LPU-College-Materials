package codeevent;

// Given the Code of a Graphical User Interface, implement the Event Handling and use
// Stream API to ensure that the new Reappear Registration is successful only when the
// same student is not registered for that course. Show the appropriate Dialog to display the
// messages accordingly.
// Also implement the event handling on "View" Button to show the details of all courses
// which are registered by the student with a given registration number.

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Round1 {
    // Map to store registered courses for each student
    private static Map<String, List<String>> registrations = new HashMap<>();

    public static void main(String[] rk) {
        //Creating the Frame
        JFrame frame = new JFrame("Reappear Registration");
        frame.setSize(600, 800);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(255, 254, 145));
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        //Adding Components in the Frame
        JLabel l = new JLabel("Reappear Registration Form");
        l.setFont(new Font("Serif", 1, 30));
        l.setForeground(Color.BLUE);
        l.setBounds(110, 20, 380, 50);
        frame.add(l);

        //Name
        JTextField name = new JTextField("Student Name");
        name.setBounds(200, 100, 200, 40);
        frame.add(name);
        name.setFont(new Font("Serif", 0, 20));

        //Registration Number
        JTextField regno = new JTextField("Registration Number");
        regno.setBounds(200, 180, 200, 40);
        frame.add(regno);
        regno.setFont(new Font("Serif", 0, 20));

        //Course
        String[] courses = {"-- Select Course --", "CSE101", "CSE310", "CSE406", "INT108"};
        JComboBox<String> course = new JComboBox<>(courses);
        course.setBounds(200, 260, 200, 40);
        frame.add(course);
        course.setFont(new Font("Serif", 0, 20));

        //Register
        JButton register = new JButton("Register");
        register.setBounds(250, 340, 100, 40);
        frame.add(register);
        register.setFont(new Font("Serif", 0, 20));

        //View Option
        JLabel lbl = new JLabel("View Registration Details");
        lbl.setFont(new Font("Serif", 1, 30));
        lbl.setForeground(Color.BLUE);
        lbl.setBounds(130, 460, 380, 50);
        frame.add(lbl);

        JTextField reg = new JTextField("Registration Number");
        reg.setBounds(100, 550, 200, 40);
        frame.add(reg);
        reg.setFont(new Font("Serif", 2, 20));
        reg.setForeground(Color.RED);

        JButton view = new JButton("View");
        view.setBounds(320, 550, 180, 40);
        frame.add(view);
        view.setFont(new Font("Serif", 3, 24));
        view.setBackground(Color.ORANGE);
        view.setForeground(Color.RED);

        // Register Button Action Listener
        register.addActionListener((ActionEvent e) -> {
            String studentName = name.getText();
            String regNumber = regno.getText();
            String selectedCourse = (String) course.getSelectedItem();
            
            if (registrations.containsKey(regNumber)) {
                List<String> registeredCourses = registrations.get(regNumber);
                if (registeredCourses.contains(selectedCourse)) {
                    JOptionPane.showMessageDialog(frame, "Student already registered for this course!");
                } else {
                    registeredCourses.add(selectedCourse);
                    JOptionPane.showMessageDialog(frame, "Registration successful!");
                }
            } else {
                List<String> newRegistration = new ArrayList<>();
                newRegistration.add(selectedCourse);
                registrations.put(regNumber, newRegistration);
                JOptionPane.showMessageDialog(frame, "Registration successful!");
            }
        });

        // View Button Action Listener
        view.addActionListener((ActionEvent e) -> {
            String regNumber = reg.getText();
            if (registrations.containsKey(regNumber)) {
                List<String> registeredCourses = registrations.get(regNumber);
                String coursesText = registeredCourses.stream().collect(Collectors.joining(", "));
                JOptionPane.showMessageDialog(frame,"Name: " +name.getText()+ "\nRegistration no: "+regno.getText()+"\nRegistered courses: " + coursesText);
            } else {
                JOptionPane.showMessageDialog(frame, "No registration found for this student!");
            }
        });

        frame.setVisible(true);
    }
}
