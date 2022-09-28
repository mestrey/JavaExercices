package ru.mirea.pr10.chairs.factory;

import ru.mirea.pr10.chairs.chair.FunctionalChair;
import ru.mirea.pr10.chairs.chair.MagicChair;
import ru.mirea.pr10.chairs.chair.VictorianChair;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair(int age);

    public MagicChair createMagicChair();

    public FunctionalChair createFunctionalChair();
}
