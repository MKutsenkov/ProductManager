package ru.netology;

public class Smartphone extends Product {

    private String manufacturer;

    public Smartphone(String name, int price, String manufacturer) {
        super(name, price);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {

        this.manufacturer = manufacturer;
    }

    @Override
    public boolean match(String text) {
        return super.match(text) || getManufacturer().equalsIgnoreCase(text);
    }
}
