package ru.mirea.pr4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ScoreManager {
    private Team team1;
    private Team team2;
    private String lastScorer = "N/A";

    public ScoreManager(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    private String getResult() {
        return "Result: " + team1.getScore() + " X " + team2.getScore();
    }

    private String getLastScorer() {
        return "Last Scorer: " + lastScorer;
    }

    private String getWinner() {
        int t1s = team1.getScore();
        int t2s = team2.getScore();

        return "Winner: " + (t1s == t2s ? "DRAW" : (t1s < t2s ? team2.getName() : team1.getName()));
    }

    public void run() {
        JFrame frame = new JFrame("AC Milan VS Real Madrid");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));

        JLabel resultLbl = new JLabel();
        resultLbl.setText(getResult());
        resultLbl.setHorizontalAlignment(JLabel.CENTER);

        JLabel lastScorerLbl = new JLabel();
        lastScorerLbl.setText(getLastScorer());
        lastScorerLbl.setHorizontalAlignment(JLabel.CENTER);

        JLabel winnerLbl = new JLabel();
        winnerLbl.setText(getWinner());
        winnerLbl.setHorizontalAlignment(JLabel.CENTER);

        JButton milanBtn = new JButton();
        milanBtn.setText("AC Milan");

        milanBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team1.scored();
                lastScorer = team1.getName();
                resultLbl.setText(getResult());
                lastScorerLbl.setText(getLastScorer());
                winnerLbl.setText(getWinner());
            }
        });

        JButton madridBtn = new JButton();
        madridBtn.setText("Real Madrid");

        madridBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team2.scored();
                lastScorer = team2.getName();
                resultLbl.setText(getResult());
                lastScorerLbl.setText(getLastScorer());
                winnerLbl.setText(getWinner());
            }
        });

        panel.add(resultLbl);
        panel.add(milanBtn);
        panel.add(madridBtn);
        panel.add(lastScorerLbl);
        panel.add(winnerLbl);

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
