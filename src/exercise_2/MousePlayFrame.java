package exercise_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MousePlayFrame extends JFrame {

    JLabel north = new JLabel("Север");
    JLabel south = new JLabel("Юг");
    JLabel west = new JLabel("Запад");
    JLabel east = new JLabel("Восток");
    JLabel center = new JLabel("Центр");

    public MousePlayFrame()
    {
        super("Мышка");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setSize(250, 250);

        Container container = getContentPane();

        container.add(north, BorderLayout.NORTH);
        container.add(south, BorderLayout.SOUTH);
        container.add(west, BorderLayout.WEST);
        container.add(east, BorderLayout.EAST);
        container.add(center, BorderLayout.CENTER);

        north.setHorizontalAlignment(JLabel.CENTER);
        south.setHorizontalAlignment(JLabel.CENTER);
        west.setHorizontalAlignment(JLabel.CENTER);
        east.setHorizontalAlignment(JLabel.CENTER);
        center.setHorizontalAlignment(JLabel.CENTER);


        north.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать на Север");
            }
        });
        south.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать на Юг");
            }
        });
        west.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать на Запад");
            }
        });
        east.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать на Восток");
            }
        });
        center.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Центр");
            }
        });
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new MousePlayFrame();
    }
}
