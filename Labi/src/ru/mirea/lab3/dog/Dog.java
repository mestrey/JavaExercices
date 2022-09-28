package ru.mirea.lab3.dog;

public abstract class Dog {
    private String name;
    private int age;
    private int size;

    public Dog(String name, int age, int size) {
        this.name = name;
        this.age = age;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract boolean canHunt();
}
