package seminars.first.Shop;

import java.util.List;

public class ShopTest {

	/*
	 * 1. Напишите тесты, чтобы проверить, что магазин хранит верный список
	 * продуктов (правильное количество продуктов, верное содержимое корзины). 2.
	 * Напишите тесты для проверки корректности работы метода
	 * getMostExpensiveProduct. 3. Напишите тесты для проверки корректности работы
	 * метода sortProductsByPrice (проверьте правильность сортировки).
	 */

	public static void main(String[] args) {

		// Создаем список продуктов
		List<Product> products = List.of(new Product(2, "Apple"), new Product(1, "Banana"), new Product(3, "Orange"),
				new Product(4, "Grapes"));

		// Создаем магазин и устанавливаем список продуктов
		Shop shop = new Shop();
		shop.setProducts(products);

		// Проверяем, что магазин хранит верный список продуктов
		assert shop.getProducts().equals(products) : "Incorrect product list";

		// Проверяем корректность работы метода getMostExpensiveProduct
		Product mostExpensiveProduct = shop.getMostExpensiveProduct();
		assert mostExpensiveProduct.getTitle().equals("Grapes") : "Incorrect most expensive product";

		// Проверяем корректность работы метода sortProductsByPrice
		List<Product> sortedProducts = shop.sortProductsByPrice();
		assert sortedProducts.get(0).getTitle().equals("Banana") : "Incorrect sorting";
		assert sortedProducts.get(1).getTitle().equals("Apple") : "Incorrect sorting";
		assert sortedProducts.get(2).getTitle().equals("Orange") : "Incorrect sorting";
		assert sortedProducts.get(3).getTitle().equals("Grapes") : "Incorrect sorting";

		System.out.println("All tests passed");
	}

}
