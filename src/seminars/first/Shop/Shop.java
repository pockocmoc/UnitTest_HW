package seminars.first.Shop;

import java.util.ArrayList;
import java.util.Comparator;
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

	public List<Product> sortProductsByPrice() {
		List<Product> sortedProducts = new ArrayList<>(products);
		sortedProducts.sort(Comparator.comparingInt(Product::getCost));
		return sortedProducts;
	}

	public Product getMostExpensiveProduct() {
		Product mostExpensiveProduct = null;
		for (Product product : products) {
			if (mostExpensiveProduct == null || product.getCost() > mostExpensiveProduct.getCost()) {
				mostExpensiveProduct = product;
			}
		}
		return mostExpensiveProduct;
	}

}
