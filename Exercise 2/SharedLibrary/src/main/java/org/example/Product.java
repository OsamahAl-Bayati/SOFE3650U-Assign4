package org.example;

public class Product {

    private String upc;

    private String name;
    private double price;

    public Product(String upc, String name, double price) {
        this.upc = upc;
        this.name = name;
        this.price = price;
    }

    public String getUPC() {
        return upc;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return"Product UPC: " + upc.toString() + " Product name: " + name + " $" + price;
    }
}
