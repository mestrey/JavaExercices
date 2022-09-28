package ru.mirea.pr1;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("First", 45);
        Book b2 = new Book("Second", 26);
        Book b3 = new Book("Third", 198);

        b3.setName("New name");

        b1.read();
        b2.read();

        b1.hasBeenRead();
        b2.hasBeenRead();
        b3.hasBeenRead();
    }
}
