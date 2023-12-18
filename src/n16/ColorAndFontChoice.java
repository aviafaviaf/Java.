package n16;

import javax.swing.*;
import java.awt.*;

public class ColorAndFontChoice extends JFrame {
    JTextArea textArea = new JTextArea();
    JMenuBar menuBar = new JMenuBar();

    ColorAndFontChoice() {
        super("aviaf");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(550, 550);

        JMenu jMenu = new JMenu("Color");
        JMenuItem jMenuItem = new JMenuItem("Blue");
        jMenuItem.addActionListener(e -> textArea.setForeground(Color.BLUE));
        jMenu.add(jMenuItem);
        jMenuItem = new JMenuItem("Red");
        jMenuItem.addActionListener(e -> textArea.setForeground(Color.RED));
        jMenu.add(jMenuItem);
        jMenuItem = new JMenuItem("Black");
        jMenuItem.addActionListener(e -> textArea.setForeground(Color.BLACK));
        jMenu.add(jMenuItem);
        menuBar.add(jMenu);

        jMenu = new JMenu("Font");
        jMenuItem = new JMenuItem("Times New Roman");
        jMenuItem.addActionListener(e -> textArea.setFont(new Font("Times New Roman", Font.PLAIN, 20)));
        jMenu.add(jMenuItem);
        jMenuItem = new JMenuItem("Arial");
        jMenuItem.addActionListener(e -> textArea.setFont(new Font("Arial", Font.PLAIN, 20)));
        jMenu.add(jMenuItem);
        jMenuItem = new JMenuItem("Calibri");
        jMenuItem.addActionListener(e -> textArea.setFont(new Font("Calibri", Font.PLAIN, 20)));
        jMenu.add(jMenuItem);
        menuBar.add(jMenu);
        textArea.setForeground(Color.BLACK);
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        setJMenuBar(menuBar);
        add(textArea);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorAndFontChoice();
    }
}
