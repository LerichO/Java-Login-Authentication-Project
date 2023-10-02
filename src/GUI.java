import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    public GUI(){

        //boilterplate login gui from Alex Lee viode: https://www.youtube.com/watch?v=iE8tZ0hn2Ws&t=1043s&ab_channel=AlexLee
        //video is based on https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqbTNQbFB1R0ZodGRfRXhtZDZGRVZxa21FVms4Z3xBQ3Jtc0tsSHZFYlFHSlJiQ1gybkRCVlFGVDVhaVhvc1M1Rkd5ZWpBQV81WkZwOUNBOG9VX0tGTzc0TkZFc2plZkFubWQ3UkZVc0l1UGhOM3FTcF85YUtrNVBMRnpPS0Y5Szg5bzRDOEtkNVZFMXZ5bmdsZ2dwbw&q=https%3A%2F%2Fintrocs.cs.princeton.edu%2Fjava%2F15inout%2FGUI.java.html&v=5o3fMLPY7qY

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new GUI());
        panel.add(button);

        JLabel success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e){

        //implement reading credentials from database / file

    }

    public static void main(String args[]){
        new GUI();
    }
}
