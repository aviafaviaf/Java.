package n5.n3;


import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("aviaf");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel() {
            @Override
            public void paint(Graphics g) {
                Scanner in = new Scanner(System.in);
                System.out.println("Путь: ");
                String path = in.next();
                Image image = new ImageIcon(path).getImage();
                g.drawImage(image, 0, 0, null);
            }
        };
        panel.setPreferredSize(new Dimension(630, 400));
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
