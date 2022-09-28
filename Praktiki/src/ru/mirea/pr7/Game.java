package ru.mirea.pr7;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ru.mirea.pr7.player.*;

public class Game {
    private int step = 0;

    private Player player1;
    private Player player2;

    public static void main(String[] args) {
        Card.createCards(10);
        Game game = new Game(new PlayerList("first"), new PlayerList("second"));
        game.distributeRandomly();
        game.consolePlay();
    }

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player getWinner() {
        step = 0;
        Player winner = null;

        while (winner == null) {
            if (step >= 106)
                break;
            winner = play();
        }

        return winner;
    }

    private void consolePlay() {
        Player winner = getWinner();
        if (winner != null)
            System.out.println(winner.getName() + " " + step);
        else
            System.out.println("botva " + step);
    }

    public void distributeRandomly() {
        player1.getCards().clear();
        player2.getCards().clear();
        Collections.shuffle(Card.getCards());
        for (int i = 0; i < Card.getCards().size(); i += 2) {
            player1.pushCard(Card.getCards().get(i));
            player2.pushCard(Card.getCards().get(i + 1));
        }
    }

    public void distributeAsExample() {
        player1.getCards().clear();
        player2.getCards().clear();

        Collections.sort((List<Card>) Card.getCards(), new Comparator<Card>() {
            @Override
            public int compare(Card c1, Card c2) {
                return c1.getValue() > c2.getValue() ? 1 : (c1.getValue() < c2.getValue()) ? -1 : 0;
            }
        });

        for (int i = 1; i < Card.getCards().size(); i += 2)
            player1.pushCard(Card.getCards().get(i));

        for (int i = 2; i < Card.getCards().size(); i += 2)
            player2.pushCard(Card.getCards().get(i));
        player2.pushCard(Card.getCards().get(0));
    }

    private Player play() {
        Card p1Card = player1.getLastCard();
        Card p2Card = player2.getLastCard();

        if (p1Card.getPower() > p2Card.getPower()) {
            player1.gainCard(player2.lostCard());
        } else {
            player2.gainCard(player1.lostCard());
        }

        step++;
        return isEnd();
    }

    private Player isEnd() {
        if (!player1.hasCards())
            return player2;
        else if (!player2.hasCards())
            return player1;
        else
            return null;
    }

    public int getStep() {
        return step;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }
}
