package ru.mirea.pr4;

public class App {
    public static void main(String[] args) {
        ScoreManager scoreManager = new ScoreManager(new AcMilan(), new Madrid());
        scoreManager.run();
    }
}
