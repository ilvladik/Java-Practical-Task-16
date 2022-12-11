package exercise_4;

import javax.swing.*;
import java.awt.*;

public class LayoutFrame extends JFrame {

    private JLabel service = new JLabel("Service:      ");
    private JTextField serviceField = new JTextField(15);
    private  JLabel user = new JLabel("User name: ");
    private JTextField userField = new JTextField(15);
    private  JLabel password = new JLabel("Password:   ");
    private JTextField passwordField = new JTextField(15);

    public LayoutFrame() {
        super("Проверка пароля");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        Container contentPane = getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);

        contentPane.add(service);
        contentPane.add(serviceField);
        contentPane.add(user);
        contentPane.add(userField);
        contentPane.add(password);
        contentPane.add(passwordField);
        layout.putConstraint(SpringLayout.WEST , service, 10, SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.WEST , user, 10, SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.WEST , password, 10, SpringLayout.WEST , contentPane);

        layout.putConstraint(SpringLayout.NORTH, service, 25, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.NORTH, user, 25, SpringLayout.NORTH, service);
        layout.putConstraint(SpringLayout.NORTH, password, 25, SpringLayout.NORTH, user);

        layout.putConstraint(SpringLayout.WEST , serviceField, 20, SpringLayout.EAST, service);
        layout.putConstraint(SpringLayout.WEST , userField, 20, SpringLayout.EAST, user);
        layout.putConstraint(SpringLayout.WEST , passwordField, 20, SpringLayout.EAST, password);

        layout.putConstraint(SpringLayout.NORTH, serviceField, 25, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.NORTH, userField, 25, SpringLayout.NORTH, serviceField);
        layout.putConstraint(SpringLayout.NORTH, passwordField, 25, SpringLayout.NORTH, userField);

        setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutFrame();
    }
}
