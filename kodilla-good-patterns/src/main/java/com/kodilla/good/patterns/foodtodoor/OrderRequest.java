package com.kodilla.good.patterns.foodtodoor;

public class OrderRequest {

    private final Supplier supplier;
    private final Product product;

    public OrderRequest(Supplier supplier, Product product) {
        this.supplier = supplier;
        this.product = product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }
}