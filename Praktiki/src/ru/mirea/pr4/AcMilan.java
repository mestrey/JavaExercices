package ru.mirea.pr4;

public class AcMilan implements Team {
    private int score = 0;

    @Override
    public String getName() {
        return "AC Milan";
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public void scored() {
        score++;
    }
}
