package com.kodilla.good.patterns.foodtodoor.suppliers;

import com.kodilla.good.patterns.foodtodoor.OrderRequest;
import com.kodilla.good.patterns.foodtodoor.Supplier;

public class ExtraFoodShop implements Supplier {

    @Override
    public void process(OrderRequest orderRequest) {
        String productName = orderRequest.getProduct().getProductName();
        int productQuantity = orderRequest.getProduct().getProductQuantity();
        if (productName != null && productQuantity > 0) {
            System.out.println("Your order has been realized");
            System.out.println("Confirmation has been sent to your email");
        } else {
            System.out.println("Your order has not been realized");
        }
    }

    @Override
    public String toString() {
        String name = "Extra Food Shop";
        return "Suppliers name (" + name + "), ";
    }
}