package ru.mirea.pr1;

public class Book {
    private String name;
    private int pages;
    private boolean readed;

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
        this.readed = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toString() {
        return name + ", pages " + pages;
    }

    public void read() {
        readed = true;
    }

    public void hasBeenRead() {
        if (readed)
            System.out.println(name + " has been read");
        else
            System.out.println(name + " has not been read");
    }
}
