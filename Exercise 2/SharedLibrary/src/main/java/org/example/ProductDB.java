package org.example;

import java.util.HashMap;
import java.util.Map;

public class ProductDB {

    private Map<String, Product> products;

    public ProductDB() {
        this.products = new HashMap<>();
    }

    // Create dummy database with example products mapped by UPC.
    public void initialize() {
        Product a = new Product("012345678912", "Computer", 899.99);
        Product b = new Product("201234567899", "Cellphone", 499.99);
        Product c = new Product("512345000107", "Laptop", 599.99);
        Product d = new Product("401234567893", "Tablet", 299.99);

        this.products.put(a.getUPC(), a);
        this.products.put(b.getUPC(), b);
        this.products.put(c.getUPC(), c);
        this.products.put(d.getUPC(), d);
    }

    public Product getProduct(String upc) {
        return products.get(upc);
    }
}
