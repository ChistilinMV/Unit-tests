package homework01.Shop;

public class Product implements Comparable<Product> { // добавляем возможность сравнивать объекты Product
    private Integer cost; // Стоимость продукта
    private String title; // Название

    // Геттеры, сеттеры:
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Задаем критерии сравнения объектов:
    // compareTo сравнивает вызывающий объект с объектом, переданным в качестве параметра
    // и возвращает в результате выполнения сравнения целое число:
    // Если compareTo() возвращает отрицательное целое число, объект меньше указанного объекта.
    // Если compareTo() возвращает ноль, объект равен указанному объекту.
    // Если compareTo() возвращает положительное целое число, объект больше указанного объекта.
    @Override
    public int compareTo(Product product) {
        return this.getCost() - (product.getCost());
    }
}