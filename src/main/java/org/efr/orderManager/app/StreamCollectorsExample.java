package org.efr.orderManager.app;

import org.efr.orderManager.processor.OrderProcessor;
import org.efr.orderManager.model.Order;

import java.util.List;

import static org.efr.orderManager.processor.OrderProcessor.*;

public class StreamCollectorsExample {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order("Laptop", 1200.0),
                new Order("Smartphone", 800.0),
                new Order("Laptop", 1500.0),
                new Order("Tablet", 500.0),
                new Order("Smartphone", 900.0),
                new Order("Smartwatch", 400.0),
                new Order("Tablet", 600.0),
                new Order("Smartwatch", 300.0),
                new Order("Laptop", 1300.0)
                );

        System.out.println("Исходные заказы: " + orders);
        System.out.println("Заказы, сгруппированные по продукту: " + groupByProductOrder(orders));
        System.out.println("Общая стоимость по каждому продукту: " + calculateTotalCostPerProduct(orders));
        System.out.println("Продукты, отсортированные по общей стоимости (по убыванию): " + sortProductsByTotalCostDesc(orders));
        displayTopThreeExpensiveProducts(orders);
    }
}
