package com.storemanagement.Main;

import com.storemanagement.entity.Order;
import com.storemanagement.entity.Customer;
import com.storemanagement.model.*;
import com.storemanagement.store.Store;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Store store = new Store("Patricia's Shop");

        System.out.println("*****Welcome to Patricia's store!*****");
        System.out.println();

        //Create products
        Product laptop = new Electronics(1L, "Laptop", 2500.00, 15);
        Product shirt = new Clothing(2L, "Shirt", 24.95, 50);
        Product sneakers = new Shoes(3L,"Shoes", 57.00, 35);
        Product earrings = new Jewelry(4L, "Jewelry", 35.00, 15);

        //Products added in store
        store.addProduct(laptop);
        store.addProduct(shirt);
        store.addProduct(sneakers);
        store.addProduct(earrings);


        //Create customers
        Customer customer1 = new Customer("C1", "Elena Mad", "elena.mad@example.com", "+44-3959-741-259", "Suite 637 102 Lilliana Glen, East Rosario, AR 57481-4802");
        //Customer customer2 = new Customer("C2", "Diana Petrov", "dianapetrov1@example.com", "+44-7168-039-993", "Suite 260 90733 Chadwick Circle, Thieltown, MI 33045");

        //Customers added in store
        store.addCustomer(customer1);
       // store.addCustomer(customer2);

        //Create order
        List<Product> orderProducts = new ArrayList<>();
        orderProducts.add(laptop);
        orderProducts.add(shirt);
        orderProducts.add(sneakers);
        orderProducts.add(earrings);
        Order command = new Order("O1", customer1, orderProducts, new Date(), laptop.getPrice() + shirt.getPrice());
        //Order command1;
       // command1 = new Order("O2", customer2, orderProducts, new Date(), sneakers.getPrice() + shirt.getPrice() + earrings.getPrice());

        //Order added in store
        //store.addOrder(command);
       // store.addOrder(command1);

        //Apply discount 10%
        store.applyDiscountToAllProducts(10);

        // Show product details after the discount
        for (Product product : store.getProducts()) {
            System.out.println("Product: " + product.getName() + product.getPrice() + "€" +", Price after discount: " + product.getPrice() + "€");
        }


        // Order details
        System.out.println("Order ID: " + command.getOrderId() + ", \n Customer: " + command.getCustomer().getName() + ", Total: " + command.getTotalAmount() + "€");
        //System.out.println("Order ID: " + command1.getOrderId() + ", Customer: " + command1.getCustomer().getName() + ", Total: " + command1.getTotalAmount() + "€");

    }
}
