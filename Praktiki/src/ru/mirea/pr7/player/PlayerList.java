package ru.mirea.pr7.player;

import java.util.ArrayList;
import java.util.Collection;

import ru.mirea.pr7.Card;

public class PlayerList implements Player {
    private String name;
    private ArrayList<Card> cards = new ArrayList<Card>();

    public PlayerList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Collection<Card> getCards() {
        return cards;
    }

    public void setCards(Collection<Card> cards) {
        this.cards = (ArrayList<Card>) cards;
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
        cards.remove(cards.size() - 1);
        cards.add(0, card);
    }

    public Card lostCard() {
        return cards.remove(cards.size() - 1);
    }

    public Card getLastCard() {
        return cards.get(cards.size() - 1);
    }

    @Override
    public String toString() {
        return "PlayerList [cards=" + cards + ", name=" + name + "]";
    }
}
