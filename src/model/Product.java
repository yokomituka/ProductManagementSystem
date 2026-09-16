package model;

public class Product {
	private String name;
	private int price;
	private int stock;
	public double tax = 0.1;

	public Product(String name, int price, int stock) {
		this.name = name;
		this.price = price + (int) (price * tax);
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price + (int) (price * tax);
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	// 商品のデータ表示
	@Override
	public String toString() {
		return "商品名:" + name + " | 値段:" + price + "円（税込） | " + "在庫数:" + stock + "個";
	}
}
