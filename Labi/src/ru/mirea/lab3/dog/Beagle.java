package ru.mirea.lab3.dog;

public class Beagle extends Dog {
    public Beagle(String name, int age, int size) {
        super(name, age, size);
    }

    @Override
    public boolean canHunt() {
        return true;
    }
}
