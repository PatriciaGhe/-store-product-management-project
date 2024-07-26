package com.storemanagement.model;

public class Clothing extends Product{
    public Clothing(String id, String name, double price, int quantity) {
        super(id, name, price, quantity);
    }

    @Override
    public void applyDiscount(double percentage) {
        double discount = getPrice() * (percentage / 100);
        setPrice(getPrice() - discount);
    }
}
