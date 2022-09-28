package ru.mirea.lab2.human;

public class Human {
    private Head head;
    private Hand hand;
    private Leg leg;

    public Human(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Head getHead() {
        return this.head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {
        return this.hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return this.leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "{" +
                " head='" + head.toString() + "'" +
                ", hand='" + hand.toString() + "'" +
                ", leg='" + leg.toString() + "'" +
                "}";
    }
}
