package ru.mirea.pr7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.*;

import ru.mirea.pr7.player.*;

public class App {
    private JFrame frame;
    private JPanel panel;
    private Game game;
    private ArrayList<JTextField> textFields = new ArrayList<JTextField>();

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    public App() {
        Card.createCards(10);
        game = new Game(new PlayerStack("first"), new PlayerStack("second"));
    }

    private void displayCards() {
        int index = 0;

        for (Card card : game.getPlayer1().getCards()) {
            textFields.get(index).setText(String.valueOf(card.getValue()));
            index++;
        }

        for (Card card : game.getPlayer2().getCards()) {
            textFields.get(index).setText(String.valueOf(card.getValue()));
            index++;
        }
    }

    private boolean retreiveCards() {
        Stack<Card> player1Cards = new Stack<Card>();
        Stack<Card> player2Cards = new Stack<Card>();

        for (int i = 0; i < textFields.size(); i++) {
            String trim = textFields.get(i).getText().trim();
            if (trim.equals("")
                    || !trim.chars().allMatch(Character::isDigit)
                    || (Integer.parseInt(trim) < 0)
                    || (Integer.parseInt(trim) > 9)) {
                JOptionPane.showMessageDialog(frame, "Incorrect input!");
                return false;
            }

            if (i < 5)
                player1Cards.add(Card.findCardByValue(Integer.parseInt(trim)));
            else
                player2Cards.add(Card.findCardByValue(Integer.parseInt(trim)));
        }

        game.getPlayer1().setCards(player1Cards);
        game.getPlayer2().setCards(player2Cards);

        return true;
    }

    private JMenuBar getMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu appMenu = new JMenu("App");
        JMenu cardsMenu = new JMenu("Cards");

        appMenu.add(new JMenuItem(new AbstractAction("About") {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "App created by Yovan Mestre :)");
            }
        }));

        appMenu.add(new JMenuItem(new AbstractAction("Play") {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (retreiveCards()) {
                    Player winner = game.getWinner();
                    if (winner != null)
                        JOptionPane.showMessageDialog(frame, winner.getName() + " " + game.getStep());
                    else
                        JOptionPane.showMessageDialog(frame, "botva " + game.getStep());
                }
            }
        }));

        appMenu.add(new JMenuItem(new AbstractAction("Exit") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }));

        cardsMenu.add(new JMenuItem(new AbstractAction("Clear") {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (JTextField textField : textFields) {
                    textField.setText("");
                }
            }
        }));

        cardsMenu.add(new JMenuItem(new AbstractAction("Fill randomly") {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.distributeRandomly();
                displayCards();
            }
        }));

        cardsMenu.add(new JMenuItem(new AbstractAction("Fill as example") {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.distributeAsExample();
                displayCards();
            }
        }));

        menuBar.add(appMenu);
        menuBar.add(cardsMenu);
        return menuBar;
    }

    public void run() {
        frame = new JFrame("War card game");
        panel = new JPanel(new GridLayout(2, 5));

        for (int i = 0; i < 10; i++) {
            JTextField textField = new JTextField(1);
            textField.setHorizontalAlignment(JLabel.CENTER);
            panel.add(textField);
            textFields.add(textField);
        }

        frame.add(panel);
        frame.setJMenuBar(getMenuBar());
        frame.setSize(400, 300);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
