package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve () {
        User user = new User("Daniel", "Kowalski", "d.kowalski@gmail.com");
        Product product = new Product("Product01", 2);

        return new OrderRequest(user, product);
    }
}