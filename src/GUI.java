import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Hashtable;

public class GUI implements ActionListener {

    LocalFileLogin logInPortal = new LocalFileLogin();

    private String usernameString;
    private String passwordString;

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton loginButton;
    private static JButton signupButton;
    private static JButton clearButton;
    private static JLabel success;

    public GUI() {

        //boilterplate login gui from Alex Lee video: https://www.youtube.com/watch?v=iE8tZ0hn2Ws&t=1043s&ab_channel=AlexLee
        //video is based on https://introcs.cs.princeton.edu/java/15inout/GUI.java.html

        usernameString = "";
        passwordString = "";

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("Username");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        loginButton = new JButton("Log In");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.setActionCommand("lg");
        loginButton.addActionListener(this);
        panel.add(loginButton);

        signupButton = new JButton("Sign Up");
        signupButton.setBounds(100, 80, 80, 25);
        signupButton.setActionCommand("su");
        signupButton.addActionListener(this);
        panel.add(signupButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(190, 80, 80, 25);
        clearButton.setActionCommand("cl");
        clearButton.addActionListener(this);
        panel.add(clearButton);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        usernameString = userText.getText();
        passwordString = hashPassword(passwordText);

        switch (((JButton) e.getSource()).getActionCommand()) {
            case "lg" -> {
                try {
                    logInPortal.logIn(usernameString, passwordString);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "su" -> {
                try {
                    logInPortal.signUp(usernameString, passwordString);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "cl" -> {
                userText.setText("");
                passwordText.setText("");
            }
        }


    }

    public void getUsername() {

    }

    public void getPassword() {

    }

    private String hashPassword(JPasswordField passwordText) {
        return "";
    }
}
