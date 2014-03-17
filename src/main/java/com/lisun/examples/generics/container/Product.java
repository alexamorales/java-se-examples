package com.lisun.examples.generics.container;

/**
 * @author Aleksey
 * @since 2/5/14
 */
public class Product implements Comparable<Product> {
    private String name;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return o.getPrice().compareTo(this.price);
    }
}
