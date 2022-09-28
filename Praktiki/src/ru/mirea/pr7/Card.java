package ru.mirea.pr7;

import java.util.ArrayList;

import ru.mirea.pr7.player.Player;

public class Card {
    private static ArrayList<Card> cards = new ArrayList<Card>();

    private Player master;
    private int value;

    public static void createCards(int quantity) {
        cards.clear();
        for (int i = 0; i < quantity; i++)
            cards.add(new Card(i));
    }

    public static Card findCardByValue(int value) {
        for (Card card : cards)
            if (card.getValue() == value)
                return card;
        return null;
    }

    public static ArrayList<Card> getCards() {
        return cards;
    }

    public Card(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int getPower() {
        return value == 0 ? 10 : value;
    }

    public void setMaster(Player master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Card [master=" + master.getName() + ", value=" + value + "]";
    }
}
