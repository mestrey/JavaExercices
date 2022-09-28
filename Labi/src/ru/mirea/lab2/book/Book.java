package ru.mirea.lab2.book;

public class Book {
    private String author;
    private String name;
    private int year;
    private String lang;
    private String genre;

    public Book(String author, String name, int year, String lang, String genre) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.lang = lang;
        this.genre = genre;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLang() {
        return this.lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "{" +
                " author='" + getAuthor() + "'" +
                ", name='" + getName() + "'" +
                ", year='" + getYear() + "'" +
                ", lang='" + getLang() + "'" +
                ", genre='" + getGenre() + "'" +
                "}";
    }
}
