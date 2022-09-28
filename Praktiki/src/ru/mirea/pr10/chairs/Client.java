package ru.mirea.pr10.chairs;

import ru.mirea.pr10.chairs.chair.Chair;
import ru.mirea.pr10.chairs.chair.MagicChair;
import ru.mirea.pr10.chairs.factory.AbstractChairFactory;
import ru.mirea.pr10.chairs.factory.ChairFactory;

public class Client {
    private Chair chair;

    public void sit() {
        if (chair instanceof MagicChair)
            ((MagicChair) chair).doMagic();
        else
            System.out.println(chair);
    }

    public void setChair() {
        AbstractChairFactory factory = new ChairFactory();
        this.chair = factory.createMagicChair();
    }
}
