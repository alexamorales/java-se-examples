package com.lisun.examples.oop.practice;

/**
 * @author Aleksey
 * @since 2/1/14
 */
public class Product {
    private String title;
    private double price;
    private int quantity;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return price * quantity;
    }
}

