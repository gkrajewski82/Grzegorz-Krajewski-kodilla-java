package com.kodilla.good.patterns.foodtodoor.suppliers;

import com.kodilla.good.patterns.foodtodoor.OrderRequest;
import com.kodilla.good.patterns.foodtodoor.Supplier;

public class HealthyShop implements Supplier {

    @Override
    public boolean process(OrderRequest orderRequest) {
        String productName = orderRequest.getProduct().getProductName();
        int productQuantity = orderRequest.getProduct().getProductQuantity();
        if (productName != null && productQuantity > 0) {
            System.out.println("Your order has been realized");
            System.out.println("Confirmation has been sent via Fax");
            return true;
        }
        System.out.println("Your order has not been realized");
        return false;
    }

    @Override
    public String toString() {
        String name = "Healthy Shop";
        return "Suppliers name (" + name + "), ";
    }
}