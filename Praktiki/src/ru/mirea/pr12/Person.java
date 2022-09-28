package ru.mirea.pr12;

public class Person {
    private String surname;
    private String name;
    private String patronymic;

    public Person(String surname) {
        this.surname = surname;
        this.name = "";
        this.patronymic = "";
    }

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getShort() {
        if (name.equals("") || patronymic.equals(""))
            return this.surname;
        return (this.surname + " " + this.name.charAt(0) + "." + this.patronymic.charAt(0) + ".");
    }
}
