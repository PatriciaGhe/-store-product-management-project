package com.storemanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Clothing extends Product{
    public Clothing( Long id, String name, String size, double price, int quantity) {
        super(id, name, size, price, quantity);
    }

    @Override
    public void applyDiscount(double percentage) {
        double discount = getPrice() * (percentage / 100);
        setPrice(getPrice() - discount);
    }
}
