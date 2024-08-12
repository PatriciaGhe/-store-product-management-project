package com.storemanagement.model;

public class Electronics extends Product{
    public Electronics(Long id, String name, double price, int quantity) {
        super(id, name, price, quantity);
    }

    @Override
    public void applyDiscount(double percentage){
        double discount = getPrice() * (percentage / 100);
        setPrice(getPrice() - discount);
    }

}
