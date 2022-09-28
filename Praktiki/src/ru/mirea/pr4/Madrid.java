package ru.mirea.pr4;

public class Madrid implements Team {
    private int score;

    @Override
    public String getName() {
        return "Madrid";
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
