package n15.n2;

import javax.swing.*;

public class CountriesFrame extends JFrame {
    JComboBox<String> jComboBox = new JComboBox<>(new String[]{
            "Австралия",
            "Китай",
            "Англия",
            "Россия"
    });
    JPanel panel = new JPanel();


    CountriesFrame() {
        super("aviaf");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 150);
        jComboBox.setSize(50, 100);
        panel.add(jComboBox);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountriesFrame();
    }
}
