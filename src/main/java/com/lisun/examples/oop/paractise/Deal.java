package com.lisun.examples.oop.paractise;

import java.util.Date;
import java.util.List;

/**
 * @author Aleksey
 * @since 2/1/14
 */
public class Deal {
    private Date date = new Date();
    private Dealer buyer;
    private Dealer seller;
    private List<Product> products;

    public Deal(Dealer buyer, Dealer seller, List<Product> products) {
        this.buyer = buyer;
        this.seller = seller;
        this.products = products;
        date = new Date();
    }

    public double getSum() {
        double sum = 0;
        for (Product product : products) {
            sum += product.getCost();
        }
        return sum;

        /*int j =0;
        double result = 0;
        while (products.size() > j ) {
            result += products.get(j).getCost();
                    j++;

        }
        return result;*/
    }

    public Date getDate() {
        return date;
    }

    public Dealer getBuyer() {
        return buyer;
    }

    public void setBuyer(Dealer buyer) {
        this.buyer = buyer;
    }

    public Dealer getSeller() {
        return seller;
    }

    public void setSeller(Dealer seller) {
        this.seller = seller;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
