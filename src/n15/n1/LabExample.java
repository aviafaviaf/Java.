package n15.n1;

import java.awt.*;
import javax.swing.*;

class LabExample extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton[] buttons = {new JButton("+"),
            new JButton("-"),
            new JButton("*"),
            new JButton("/"),
    };
    Font font = new Font("Arial", Font.BOLD, 18);

    LabExample() {
        super("aviaf");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(230, 150);
        add(new JLabel("1-ое число"));
        add(jta1);
        add(new JLabel("2-ое число"));
        add(jta2);
        for (JButton button : buttons) addButton(button);
        setVisible(true);
    }

    private void addButton(JButton button) {
        add(button);
        button.addActionListener(e -> {
            try {
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());

                String text = button.getText();
                if ("+".equals(text)) {
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } else if ("-".equals(text)) {
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 - x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } else if ("*".equals(text)) {
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 * x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } else if ("/".equals(text)) {
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 / x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                }


            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Ошибка", "aviaf", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        new LabExample();
    }
}
