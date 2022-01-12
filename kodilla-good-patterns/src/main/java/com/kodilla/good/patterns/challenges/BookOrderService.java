package com.kodilla.good.patterns.challenges;

public class BookOrderService implements OrderService {

    @Override
    public boolean order(User user, Product book) {
        if (user != null && book != null) {
            return true;
        }
        return false;
    }
}