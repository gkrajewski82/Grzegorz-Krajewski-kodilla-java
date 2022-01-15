package com.kodilla.good.patterns.foodtodoor;

import com.kodilla.good.patterns.foodtodoor.suppliers.GlutenFreeShop;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        Product extraFoodShopProduct = new Product("Beef steak", 1);

        return new OrderRequest(glutenFreeShop, extraFoodShopProduct);
    }
}