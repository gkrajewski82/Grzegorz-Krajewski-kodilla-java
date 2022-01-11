package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest productOrderRequest = orderRequestRetriever.retrieve();

        OrderProcessor productOrderProcessor = new OrderProcessor(new MailService(), new BookOrderService(),
                new BookOrderRepository());
        productOrderProcessor.process(productOrderRequest);
    }
}