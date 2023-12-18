package n5.n1;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        JPanel panel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setPreferredSize(new Dimension(400, 300));

        int width = 400;
        int height = 1;
        int[] scores = {0, 0};

        JLabel scoresLabel = new JLabel("Result: 0 X 0", JLabel.CENTER);
        scoresLabel.setBounds(width / 2 - scoresLabel.getPreferredSize().width / 2, 1, scoresLabel.getPreferredSize().width, scoresLabel.getPreferredSize().height);
        height += scoresLabel.getPreferredSize().height + 4;
        JLabel lastScorer = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        lastScorer.setBounds(width / 2 - lastScorer.getPreferredSize().width / 2, height, lastScorer.getPreferredSize().width, lastScorer.getPreferredSize().height);
        height += lastScorer.getPreferredSize().height + 5;
        JLabel winner = new JLabel("Winner: ", JLabel.CENTER);
        winner.setBounds(width / 2 - winner.getPreferredSize().width / 2, height, winner.getPreferredSize().width, winner.getPreferredSize().height);
        height += winner.getPreferredSize().height + 5;

        JButton buttonMilan = new JButton("AC Milan");
        buttonMilan.setBounds(width / 4 - 150 / 2, height, 150, buttonMilan.getPreferredSize().height);
        buttonMilan.addActionListener(e -> {
            scores[0]++;
            scoresLabel.setText("Result: " + scores[0] + " X " + scores[1]);
            scoresLabel.setBounds(width / 2 - scoresLabel.getPreferredSize().width / 2, scoresLabel.getY(), scoresLabel.getPreferredSize().width, scoresLabel.getPreferredSize().height);
            lastScorer.setText("Last Scorer: AC Milan");
            lastScorer.setBounds(width / 2 - lastScorer.getPreferredSize().width / 2, lastScorer.getY(), lastScorer.getPreferredSize().width, lastScorer.getPreferredSize().height);

        });

        JButton buttonMadrid = new JButton("Real Madrid");
        buttonMadrid.setBounds(width / 2 + width / 4 - 150 / 2, height, 150, buttonMadrid.getPreferredSize().height);
        buttonMadrid.addActionListener(e -> {
            scores[1]++;
            scoresLabel.setText("Result: " + scores[0] + " X " + scores[1]);
            scoresLabel.setBounds(width / 2 - scoresLabel.getPreferredSize().width / 2, scoresLabel.getY(), scoresLabel.getPreferredSize().width, scoresLabel.getPreferredSize().height);
            lastScorer.setText("Last Scorer: Real Madrid");
            lastScorer.setBounds(width / 2 - lastScorer.getPreferredSize().width / 2, lastScorer.getY(), lastScorer.getPreferredSize().width, lastScorer.getPreferredSize().height);

        });
        height += buttonMadrid.getPreferredSize().height + 5;

        JButton end = new JButton("End");
        end.setBounds(width / 2 -150 / 2, height, 150, end.getPreferredSize().height);
        end.addActionListener(e -> {
            buttonMilan.removeActionListener(buttonMilan.getActionListeners()[0]);
            buttonMadrid.removeActionListener(buttonMadrid.getActionListeners()[0]);
            end.removeActionListener(end.getActionListeners()[0]);
            if (scores[0] > scores[1]) winner.setText("Winner : AC Milan");
            else if (scores[1] > scores[0]) winner.setText("Winner: Real Madrid");
            else winner.setText("Winner: draw");
            winner.setBounds(width / 2 - winner.getPreferredSize().width / 2, winner.getY(), winner.getPreferredSize().width, winner.getPreferredSize().height);
        });

        panel.setLayout(null);
        panel.add(scoresLabel);
        panel.add(lastScorer);
        panel.add(winner);
        panel.add(buttonMilan);
        panel.add(buttonMadrid);
        panel.add(end);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
