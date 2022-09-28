package ru.mirea.pr7.player;

import java.util.ArrayDeque;
import java.util.Collection;

import ru.mirea.pr7.Card;

public class PlayerDequeue implements Player {
    private String name;
    private ArrayDeque<Card> cards = new ArrayDeque<Card>();

    public PlayerDequeue(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Collection<Card> getCards() {
        return cards;
    }

    public void setCards(Collection<Card> cards) {
        this.cards = (ArrayDeque<Card>) cards;
    }

    public boolean hasCards() {
        return cards.size() > 0;
    }

    public void pushCard(Card card) {
        card.setMaster(this);
        cards.push(card);
    }

    public void gainCard(Card card) {
        card.setMaster(this);
        cards.addFirst(getLastCard());
        cards.pop();
        cards.addFirst(card);
    }

    public Card lostCard() {
        return cards.pop();
    }

    public Card getLastCard() {
        return cards.getLast();
    }

    @Override
    public String toString() {
        return "PlayerDequeue [cards=" + cards + ", name=" + name + "]";
    }
}
