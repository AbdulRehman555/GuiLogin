import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class GUI implements ActionListener {
    private static JPanel panel;
    private static JFrame frame;
    private static JLabel userLabel;
    private static JTextField userText;
    private static JTextField passwordText;
    private static  JLabel  passwordLabel;
    private static JButton button;
    private static JLabel success;

    public static void main(String [] args){
        panel =new JPanel();
        frame=new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame .add(panel);
        panel.setLayout(null);
       userLabel=new JLabel("User");
        userLabel.setBounds(70,20,80,25);
        panel.add(userLabel);
       userText=new JTextField();
        userText.setBounds(150,20,165,25);
        panel.add(userText);
        passwordLabel=new JLabel("Password");
        passwordLabel.setBounds(70,50,80,25);
        panel.add(passwordLabel);
       passwordText=new JPasswordField();
        passwordText.setBounds(150,50,165,25);
        panel.add(passwordText);
        button=new JButton("Login");
        button.setBounds(70,80,70,20);
        button.addActionListener(new GUI());
        panel.add(button);
        success=new JLabel("");
        success.setBounds(10,130,300,25);
        panel.add(success);

        frame.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        if(user.equals("AbdulRehman") && password.equals("imran.khan.123"))
            success.setText("                                      Login Successful!");
    }
}
