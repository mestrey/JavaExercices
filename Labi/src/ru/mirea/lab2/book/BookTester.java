package ru.mirea.lab2.book;

public class BookTester {
    public static void main(String[] args) {
        Book book = new Book(
                "Popovitch",
                "Against the power",
                1999,
                "ru",
                "Dramatic");

        System.out.println(book.toString());
    }
}
