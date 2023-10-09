package homework01.Shop;

// Домашнее задание
// Задание 2. (*)
// Мы хотим улучшить функциональность нашего интернет-магазина. Ваша задача - добавить два новых метода в
// класс Shop:
// ● Метод sortProductsByPrice(), который сортирует список продуктов по стоимости.
// ● Метод getMostExpensiveProduct(), который возвращает самый дорогой продукт.
// Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество
// продуктов, верное содержимое корзины).
// Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
// Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность
// сортировки).
// Используйте класс Product для создания экземпляров продуктов и класс Shop для написания методов
// сортировки и тестов.

import java.util.Collections;
import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        Collections.sort(products);
        return products;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        return sortProductsByPrice().get(products.size()-1);
    }

}