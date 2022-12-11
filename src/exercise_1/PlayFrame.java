package exercise_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayFrame extends JFrame {

    private int random;
    private int count;
    JButton jButton;
    JTextField jTextField;
    JLabel jLabel;

    public PlayFrame() {
        super("Угадайка!");
        setSize(300, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        random = (int)(Math.random() * 20);
        count = 3;

        jLabel = new JLabel("Попыток осталось: " + count);
        jTextField = new JTextField(20);
        jButton = new JButton("Ввод");

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = jTextField.getText();
                if (content.isEmpty()) return;
                try {
                    int x = Integer.parseInt(content);
                    if (random == x) {
                        JOptionPane.showMessageDialog(null, "Вы угадали: " + random);
                        System.exit(0);
                    } else {
                        count--;
                        jLabel.setText("Попыток осталось: " + count);
                        if (count == 0) {
                            JOptionPane.showMessageDialog(null, "Вы не угадали: " + random);
                            System.exit(0);
                        }
                        else {
                            if (x < random) {
                                JOptionPane.showMessageDialog(null, "Больше");
                            } else if (x > random){
                                JOptionPane.showMessageDialog(null, "Меньше");
                            }
                        }
                    }
                } catch (NumberFormatException ex) {
                    jTextField.setText("Значение должно быть числом от 0 до 20");
                }
            }
        });

        add(jLabel);
        add(jTextField);
        add(jButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new PlayFrame();
    }

}
