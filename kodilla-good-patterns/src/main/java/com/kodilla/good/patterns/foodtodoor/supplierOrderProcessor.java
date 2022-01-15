package com.kodilla.good.patterns.foodtodoor;

public class supplierOrderProcessor {

    private final Supplier supplier;

    public supplierOrderProcessor(Supplier supplier) {
        this.supplier = supplier;
    }

    public void supplierOrderProcess(OrderRequest orderRequest) {
        this.supplier.process(orderRequest);
    }
}