package ru.mirea.pr10.chairs.factory;

import ru.mirea.pr10.chairs.chair.FunctionalChair;
import ru.mirea.pr10.chairs.chair.MagicChair;
import ru.mirea.pr10.chairs.chair.VictorianChair;

public class ChairFactory implements AbstractChairFactory {
    @Override
    public VictorianChair createVictorianChair(int age) {
        return new VictorianChair(age);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
