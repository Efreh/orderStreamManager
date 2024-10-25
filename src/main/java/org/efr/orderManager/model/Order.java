package org.efr.orderManager.model;

import java.util.Objects;

public class Order {
    private final String product;
    private final double cost;

    public Order(String product, double cost) {
        this.product = product;
        this.cost = cost;
    }

    public String getProduct() {
        return product;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Заказ (продукт='" + product + "', стоимость=" + cost + ')';
    }
}
