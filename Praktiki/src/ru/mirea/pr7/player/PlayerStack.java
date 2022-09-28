package ru.mirea.pr7.player;

import java.util.Collection;
import java.util.Stack;

import ru.mirea.pr7.Card;

public class PlayerStack implements Player {
    private String name;
    private Stack<Card> cards = new Stack<Card>();

    public PlayerStack(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Collection<Card> getCards() {
        return cards;
    }

    public void setCards(Collection<Card> cards) {
        this.cards = (Stack<Card>) cards;
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
        cards.insertElementAt(getLastCard(), 0);
        cards.pop();
        cards.insertElementAt(card, 0);
    }

    public Card lostCard() {
        return cards.pop();
    }

    public Card getLastCard() {
        return cards.lastElement();
    }

    @Override
    public String toString() {
        return "PlayerStack [cards=" + cards + ", name=" + name + "]";
    }
}
