package com.kodilla.good.patterns.challenges;

public class BookOrderRepository implements OrderRepository {

    public void createOrder(User user, Product book) {
        System.out.println("Order for: " + user + ", product: " + book);
    }
}