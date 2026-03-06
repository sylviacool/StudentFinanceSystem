package com.bootcamp.management;

public class Product {
    private int id;
    private String name;
    private double price;
    private String category;
    private int stockQuantity;

    public Product(int id, String name, double price, String category, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.stockQuantity = stockQuantity;
    }

    // Getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }

    // Logic to update stock
    public void reduceStock(int quantity) {
        if (this.stockQuantity >= quantity) {
            this.stockQuantity -= quantity;
        }
    }

    @Override
    public String toString() {
        return String.format("ID: %d | [%s] %-15s | Price: $%.2f | Stock: %d",
                id, category, name, price, stockQuantity);
    }
}