package homework01.Shop;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
    public static void main(String[] args) {
        // Подготовка:
        Shop testShop = new Shop();
        testShop.setProducts(getShuffleListProducts(getTestListProducts()));

        // Действие и проверка результата:
        // Проверяем, что магазин хранит верный список продуктов (количество продуктов)
        assertThat(testShop.getProducts()).hasSize(4);

        // Проверить, что магазин возвращает верный самый дорогой продукт getMostExpensiveProduct
        assertThat(testShop.getMostExpensiveProduct().getTitle()).isEqualTo(getTestListProducts().get(3).getTitle());

        // Проверить, что магазин возвращает верный отсортированный по цене список продуктов
        assertThat(testShop.sortProductsByPrice().get(0).getCost()).isEqualTo(100);
        assertThat(testShop.sortProductsByPrice().get(1).getCost()).isEqualTo(150);
        assertThat(testShop.sortProductsByPrice().get(2).getCost()).isEqualTo(299);
        assertThat(testShop.sortProductsByPrice().get(3).getCost()).isEqualTo(500);
    }

    static List<Product> getTestListProducts() {

        Product productA = new Product();
        productA.setTitle("Product A");
        productA.setCost(100);

        Product productB = new Product();
        productB.setTitle("Product B");
        productB.setCost(150);

        Product productC = new Product();
        productC.setTitle("Product C");
        productC.setCost(299);

        Product productD = new Product();
        productD.setTitle("Product D");
        productD.setCost(500);

        List<Product> productList = new ArrayList<>();

        productList.add(productA);
        productList.add(productB);
        productList.add(productC);
        productList.add(productD);

        return productList;
    }

    static List<Product> getShuffleListProducts(List<Product> productList) {
        Collections.shuffle(productList);
        return productList;
    }

}