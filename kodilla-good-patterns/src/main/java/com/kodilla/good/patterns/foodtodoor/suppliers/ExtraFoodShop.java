package com.kodilla.good.patterns.foodtodoor.suppliers;

import com.kodilla.good.patterns.foodtodoor.OrderRequest;
import com.kodilla.good.patterns.foodtodoor.Supplier;

public class ExtraFoodShop implements Supplier {

    @Override
    public boolean process(OrderRequest orderRequest) {
        String productName = orderRequest.getProduct().getProductName();
        int productQuantity = orderRequest.getProduct().getProductQuantity();
        if (productName != null && productQuantity > 0) {
            System.out.println("Your order has been realized");
            System.out.println("Confirmation has been sent to your email");
            return true;
        }
        System.out.println("Your order has not been realized");
        return false;
    }

    @Override
    public String toString() {
        String name = "Extra Food Shop";
        return "Suppliers name (" + name + "), ";
    }
}