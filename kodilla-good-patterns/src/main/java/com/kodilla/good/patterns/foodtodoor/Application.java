package com.kodilla.good.patterns.foodtodoor;

public class Application {

    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest order = orderRequestRetriever.retrieve();
        orderProcessor.orderProcess(order);
    }
}