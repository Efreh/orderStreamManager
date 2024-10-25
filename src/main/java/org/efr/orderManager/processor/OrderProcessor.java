package org.efr.orderManager.processor;

import org.efr.orderManager.model.Order;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrderProcessor {
    public static Map<String, List<Order>> groupByProductOrder(List<Order> orders) {
        return orders.stream()
                .collect(Collectors.groupingBy(Order::getProduct));
    }

    public static Map<String, Double> calculateTotalCostPerProduct(List<Order> orders) {
        return orders.stream().
                collect(Collectors.groupingBy(Order::getProduct,
                        Collectors.summingDouble(Order::getCost)));
    }

    public static Map<String, Double> sortProductsByTotalCostDesc(List<Order> orders) {
        return calculateTotalCostPerProduct(orders).entrySet().stream().
                sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new
                ));
    }

    public static void displayTopThreeExpensiveProducts(List<Order> orders){
        Map<String, Double> sortedProducts = sortProductsByTotalCostDesc(orders);

        List<String> topThreeProducts = sortedProducts.keySet().stream()
                .limit(3)
                .toList();

        double totalCostOfTopThree = sortedProducts.values().stream()
                .limit(3)
                .mapToDouble(Double::doubleValue)
                .sum();

        System.out.println("Топ 3 самых дорогих продуктов: " + topThreeProducts);
        System.out.println("Общая стоимость этих продуктов: " + totalCostOfTopThree);
    }
}
