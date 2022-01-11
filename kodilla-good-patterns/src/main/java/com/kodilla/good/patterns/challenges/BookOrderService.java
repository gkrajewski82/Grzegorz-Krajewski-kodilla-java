package com.kodilla.good.patterns.challenges;

public class BookOrderService implements OrderService {

    public boolean order(User user, Product book) {
        if (user != null && book != null) {
            return true;
        } else {
            return false;
        }
    }
}