package ru.mirea.pr7.player;

import java.util.Collection;

import ru.mirea.pr7.Card;

public interface Player {
    public String getName();

    public Collection<Card> getCards();

    public void setCards(Collection<Card> cards);

    public boolean hasCards();

    public void pushCard(Card card);

    public void gainCard(Card card);

    public Card lostCard();

    public Card getLastCard();

    public String toString();
}
