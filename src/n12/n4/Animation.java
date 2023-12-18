package n12.n4;


import javax.swing.*;
import java.awt.*;

public class Animation extends JPanel {
    private int x = 0;
    private boolean direction = true;
    private final String imgName = "C:\\Users\\a-lex\\IdeaProjects\\Java\\src\\n5\\n4\\Images\\frame_~_delay-0.1s.gif";
    private Image image = new ImageIcon().getImage();

    public static void main(String[] args) {

        JFrame frame = new JFrame("Ы");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Animation animation = new Animation();

        animation.setPreferredSize(new Dimension(495, 260));
        frame.add(animation);
        frame.pack();
        frame.setVisible(true);

        Timer timer = new Timer(40, e -> {
            animation.repaint();
        });
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        x = (x + 1) % 6;
        image = new ImageIcon(imgName.replace("~", String.valueOf(x))).getImage();
        g.drawImage(image, 0, 0, null);
    }
}
