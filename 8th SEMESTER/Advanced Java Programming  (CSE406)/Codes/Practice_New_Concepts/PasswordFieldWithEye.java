import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PasswordFieldWithEye extends JPasswordField {
    private boolean showPassword = false;
    private JLabel eyeLabel;

    public PasswordFieldWithEye() {
        eyeLabel = new JLabel("\uD83D\uDC41"); // Eye symbol: 🔁
        eyeLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        eyeLabel.setForeground(Color.GRAY);
        eyeLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        eyeLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showPassword = !showPassword;
                updateEchoChar();
            }
        });

        updateEchoChar();

        setLayout(new BorderLayout());
        add(eyeLabel, BorderLayout.EAST);
    }

    private void updateEchoChar() {
        if (showPassword) {
            setEchoChar((char) 0);
            eyeLabel.setText("\uD83D\uDC40"); // Eye with slash symbol: 📅
        } else {
            setEchoChar('\u2022'); // Default bullet character for password field
            eyeLabel.setText("\uD83D\uDC41"); // Eye symbol: 🔁
        }
    }
}
