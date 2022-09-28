package ru.mirea.pr7.player;

import java.util.Collection;
import java.util.LinkedList;

import ru.mirea.pr7.Card;

public class PlayerQueue implements Player {
    private String name;
    private LinkedList<Card> cards = new LinkedList<Card>();

    public PlayerQueue(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Collection<Card> getCards() {
        return cards;
    }

    public void setCards(Collection<Card> cards) {
        this.cards = (LinkedList<Card>) cards;
    }

    public boolean hasCards() {
        return cards.size() > 0;
    }

    public void pushCard(Card card) {
        card.setMaster(this);
        cards.add(card);
    }

    public void gainCard(Card card) {
        card.setMaster(this);
        cards.add(0, getLastCard());
        cards.remove();
        cards.add(0, card);
    }

    public Card lostCard() {
        return cards.remove();
    }

    public Card getLastCard() {
        return cards.getLast();
    }

    @Override
    public String toString() {
        return "PlayerQueue [cards=" + cards + ", name=" + name + "]";
    }
}
