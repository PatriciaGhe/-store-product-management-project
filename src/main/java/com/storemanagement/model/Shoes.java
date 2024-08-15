package com.storemanagement.model;

public class Shoes extends Product{
    public Shoes(Long id, String name, String size, double price, int quantity) {
        super(id, name, size, price, quantity);
    }

    @Override
    public void applyDiscount(double percentage) {
        double discount = getPrice() * (percentage / 100);
        setPrice(getPrice() - discount);
    }

}
