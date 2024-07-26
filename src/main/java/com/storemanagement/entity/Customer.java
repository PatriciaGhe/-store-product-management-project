package com.storemanagement.entity;

public class Customer extends Person {
    public Customer(String id, String name, String email, String phone, String address) {
        super(id, name, email, phone, address);
    }

    @Override
    public void displayRole() {
        System.out.println("Customer");
    }
}
