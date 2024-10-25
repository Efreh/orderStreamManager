
# Order Processor

Программа `Order Processor` демонстрирует использование Stream API для работы с коллекциями данных на примере списка заказов с продуктами и их стоимостью.

## Описание

Класс `OrderProcessor` выполняет следующие задачи:

1. **Группировка заказов по продукту**: каждый заказ сгруппирован по типу продукта.
2. **Подсчёт общей стоимости по продукту**: определение общей стоимости всех заказов для каждого продукта.
3. **Сортировка продуктов по стоимости**: продукты отсортированы по общей стоимости в порядке убывания.
4. **Определение самых дорогих продуктов**: выбор трёх самых дорогих продуктов и подсчёт их общей стоимости.

## Используемые технологии

- **Java 8+**: Для использования Stream API и коллекций.
- **Stream API**: Для группировки, сортировки и фильтрации данных.
- **Коллекторы**: Для агрегации данных по заданным условиям.

## Пример использования

```java
public static void main(String[] args) {
    List<Order> orders = List.of(
        new Order("Ноутбук", 1200.0),
        new Order("Смартфон", 800.0),
        new Order("Ноутбук", 1500.0),
        new Order("Планшет", 500.0),
        new Order("Смартфон", 900.0),
        new Order("Смарт-часы", 400.0),
        new Order("Планшет", 600.0),
        new Order("Смарт-часы", 300.0),
        new Order("Ноутбук", 1300.0)
    );

    OrderProcessor.displayTopThreeExpensiveProducts(orders);
}
```

## Вывод программы

- **Топ 3 самых дорогих продуктов**: Список трёх самых дорогих продуктов.
- **Общая стоимость этих продуктов**: Общая стоимость выбранных продуктов.