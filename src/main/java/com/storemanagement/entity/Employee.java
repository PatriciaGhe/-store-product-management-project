package com.storemanagement.entity;

public class Employee extends Person {
    private String position;

    public Employee(String id, String name, String email, String phone, String address, String position) {
        super(id, name, email, phone, address);
        this.position = position;
    }

    @Override
    public void displayRole()  {
        System.out.println("Employee - " + position);
    }
}
