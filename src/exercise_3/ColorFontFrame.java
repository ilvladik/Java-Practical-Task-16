package exercise_3;

import javax.swing.*;
import java.awt.*;

public class ColorFontFrame extends JFrame {

    public ColorFontFrame(){
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea jTextArea = new JTextArea(10, 20);
        jTextArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));

        String[] colorsName = {"Черный", "Красный", "Синий"};
        JComboBox<String> colors = new JComboBox<>(colorsName);
        colors.setSelectedIndex(0);

        String[] fontsName = {"Times New Roman", "MS Sans Serif", "Courier New"};
        JComboBox<String> fonts = new JComboBox<>(fontsName);
        fonts.setSelectedIndex(0);

        fonts.addItemListener(e -> jTextArea.setFont(new Font(fontsName[fonts.getSelectedIndex()], Font.PLAIN, 12)));

        colors.addItemListener(e -> {
            Color c;
            switch (colors.getSelectedIndex()){
                case 1:
                    c = Color.RED;
                    break;
                case 2:
                    c = Color.BLUE;
                    break;
                default: c = Color.BLACK;
            }
            jTextArea.setForeground(c);
        });
        setLayout(new FlowLayout());
        add(colors);
        add(fonts);
        add(jTextArea);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorFontFrame();
    }
}
