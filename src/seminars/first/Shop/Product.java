package seminars.first.Shop;

public class Product {
    private Integer cost; // Стоимость продукта
    private String title; // Название

    // Геттеры, сеттеры:
    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

	public Product(Integer cost, String title) {
		super();
		this.cost = cost;
		this.title = title;
	}

	@Override
	public String toString() {
		return "Product [cost=" + cost + ", title=" + title + "]";
	}
    
}