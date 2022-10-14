package ru.netology;

import java.util.concurrent.atomic.AtomicInteger;

public class Product {
    protected final int id;
    protected String name;
    protected int price;

    public Product(String name, int price) {
        this.id = newId();
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean match(String text) {
        return getName().equalsIgnoreCase(text);
    }

    private static final AtomicInteger idCounter = new AtomicInteger();

    protected static int newId() {
        return idCounter.getAndIncrement();
    }
}