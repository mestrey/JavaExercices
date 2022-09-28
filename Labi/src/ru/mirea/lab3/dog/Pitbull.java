package ru.mirea.lab3.dog;

public class Pitbull extends Dog {
    public Pitbull(String name, int age, int size) {
        super(name, age, size);
    }

    @Override
    public boolean canHunt() {
        return false;
    }
}
