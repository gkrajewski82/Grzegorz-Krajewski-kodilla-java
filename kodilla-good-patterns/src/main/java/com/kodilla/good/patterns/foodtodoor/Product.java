package com.kodilla.good.patterns.foodtodoor;

public class Product {

    private final String productName;
    private final int productQuantity;

    public Product(String productName, int productQuantity) {
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    @Override
    public String toString() {
        return "Product name (" + productName + "), " + "Product quantity (" + productQuantity + ")";
    }
}