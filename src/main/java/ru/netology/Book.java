package ru.netology;

public class Book extends Product {
    private final String author;

    public Book(String name, int price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public boolean match(String text) {
        return super.match(text) || getAuthor().equalsIgnoreCase(text);
    }
}
