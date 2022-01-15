package com.kodilla.good.patterns.foodtodoor;

public class OrderProcessor {

    public void orderProcess(final OrderRequest orderRequest) {
        Supplier supplier = orderRequest.getSupplier();
        Product product = orderRequest.getProduct();
        boolean isOrdered = supplier != null && product.getProductName() != null && product.getProductQuantity() > 0;

        if (isOrdered) {
            System.out.println("Order data: " + supplier + product);
        } else {
            System.out.println("The order is not correct");
        }
        supplierOrderProcessor supplierOrderProcessor = new supplierOrderProcessor(orderRequest.getSupplier());
        supplierOrderProcessor.supplierOrderProcess(orderRequest);
    }
}