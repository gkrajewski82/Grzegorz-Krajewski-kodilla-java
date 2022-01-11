package com.kodilla.good.patterns.challenges;

public class Product {

    private final String productName;
    private final int quantityOfProducts;

    public Product(String productName, int quantityOfProducts) {
        this.productName = productName;
        this.quantityOfProducts = quantityOfProducts;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantityOfProducts() {
        return quantityOfProducts;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", quantityOfProducts=" + quantityOfProducts +
                '}';
    }
}