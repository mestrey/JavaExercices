package ru.mirea.lab6.guessing;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class Guessing {
    private JFrame frame;

    private int toGuess;
    private int attempts = 3;
    private boolean hasWin = false;
    private JLabel text;
    private JLabel attemptsLb;
    private JLabel error;

    public Guessing() {
        frame = new JFrame("Guessing");

        Random random = new Random();
        toGuess = random.nextInt(20) + 1;

        text = new JLabel("Guess my number!");
        text.setHorizontalAlignment(JLabel.CENTER);

        attemptsLb = new JLabel("Attempts left: " + attempts);
        attemptsLb.setHorizontalAlignment(JLabel.CENTER);

        error = new JLabel("");
        error.setHorizontalAlignment(JLabel.CENTER);
    }

    private void toAttempt() {
        attempts--;
        attemptsLb.setText("Attempts left: " + attempts);
        if (attempts == 0)
            error.setText("LOST!!!");
    }

    private String win() {
        hasWin = true;
        return "WIN!!!";
    }

    public void run() {
        JPanel textPanel = new JPanel();
        JPanel inputPanel = new JPanel();

        JTextField textField = new JTextField();
        textField.setColumns(2);

        JButton button = new JButton("guess");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (attempts > 0 && !hasWin)
                    try {
                        int userGuess = Integer.parseInt(textField.getText());

                        if (userGuess < 1 || userGuess > 20)
                            error.setText("Integer must be beetween 1 and 20");
                        else {
                            error.setText(
                                    userGuess < toGuess ? "To small!"
                                            : (userGuess > toGuess ? "To big!" : win()));
                            toAttempt();
                        }
                    } catch (NumberFormatException err) {
                        error.setText("Input String cannot be parsed to Integer.");
                    }
            }
        });

        textPanel.setLayout(new GridLayout(3, 1));
        textPanel.add(text);
        textPanel.add(attemptsLb);
        textPanel.add(error);
        inputPanel.add(textField);
        inputPanel.add(button);

        frame.setLayout(new GridLayout(2, 1));
        frame.add(textPanel);
        frame.add(inputPanel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
