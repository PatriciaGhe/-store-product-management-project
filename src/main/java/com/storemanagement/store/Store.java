package com.storemanagement.store;

import com.storemanagement.model.Product;
import com.storemanagement.entity.Customer;
import org.springframework.core.annotation.Order;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private String name;
    private List<Product> products;
    private List<Customer> customers;
    private List<Order> orders;

    public Store(String name) {
        this.name = name;
        this.products = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    // Method for adding products
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method for adding customers
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Method for adding orders
    public void addOrder(Order order) {
        orders.add(order);
    }

    // How to apply discounts to all products
    public void applyDiscountToAllProducts(double percentage) {
        for (Product product : products) {
            product.applyDiscount(percentage);
        }
    }

    public List<Product> getProducts() {
        return products;
    }
    public List<Order> getOrders() {
        return orders;
    }
}
