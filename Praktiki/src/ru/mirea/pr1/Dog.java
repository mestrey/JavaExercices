package ru.mirea.pr1;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
        this.age = 0;
    }

    public Dog() {
        name = "Pup";
        age = 0;
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

    public String toString() {
        return name + ", age " + age;
    }

    public void intoHumanAge() {
        System.out.println(name + "'s age in human years is " + age * 7 + " years");
    }
}
