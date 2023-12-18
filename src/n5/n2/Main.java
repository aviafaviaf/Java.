package n5.n2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {
    public static Color[] colors = {
            Color.BLACK, Color.BLUE, Color.GREEN, Color.RED, Color.GRAY
    };

    public static void main(String[] args) {
        JFrame frame = new JFrame("My first GUI");
        JPanel panel = new JPanel() {
            public void paint(Graphics g) {
                Random random = new Random();
                int num;
                int[] x;
                int[] y;
                for (int j = 0; j < 20; j++) {
                    g.setColor(colors[random.nextInt(5)]);
                    switch (random.nextInt(5)) {
                        case 0:
                            g.drawLine(random.nextInt(600), random.nextInt(600), random.nextInt(600), random.nextInt(600));
                            break;
                        case 1:
                            g.drawOval(random.nextInt(600), random.nextInt(600), random.nextInt(100), random.nextInt(100));
                            break;
                        case 2:
                            g.drawRect(random.nextInt(600), random.nextInt(600), random.nextInt(100), random.nextInt(100));
                            break;
                        case 3:
                            num = random.nextInt(10);
                            x = new int[num];
                            y = new int[num];
                            for (int i = 0; i < num; i++) {
                                x[i] = random.nextInt(600);
                                y[i] = random.nextInt(600);
                            }
                            g.drawPolygon(x, y, num);
                            break;
                        case 4:
                            num = random.nextInt(10);
                            x = new int[num];
                            y = new int[num];
                            for (int i = 0; i < num; i++) {
                                x[i] = random.nextInt(600);
                                y[i] = random.nextInt(600);
                            }
                            g.drawPolyline(x, y, num);
                            break;

                    }
                }
            }
        };
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setPreferredSize(new Dimension(600, 600));
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
