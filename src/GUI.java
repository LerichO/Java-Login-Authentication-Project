import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

public class GUI implements ActionListener {

    private String usernameString;
    private String passwordString;

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public GUI(){

        //boilterplate login gui from Alex Lee video: https://www.youtube.com/watch?v=iE8tZ0hn2Ws&t=1043s&ab_channel=AlexLee
        //video is based on https://introcs.cs.princeton.edu/java/15inout/GUI.java.html

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

        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(this);
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){

        usernameString = userText.getText();
        passwordString = passwordText.getText();
        System.out.println("Username: " + usernameString);
        System.out.println("Password: " + passwordString);
        //implement reading credentials from database / file

    }

    // once upgraded to a Spring + MongoDB app, will move this to a Spring application java class
    public static void main(String args[]){
        new GUI();
    }
}
