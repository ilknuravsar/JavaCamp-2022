package classesWithAttributes;

public class Product {
	
	public Product(int id, String name, String description, double price, int stockAmount) {
		System.out.println("Yap�c� Blok �al��t�");
		this.id  = id;
		this.name = name;
		this.description= description;
		this.price= price;
		this.stockAmount = stockAmount;
	}
	
	public Product() {
		
	}
	 private int id;
	 String name;
	 String description;
	 private double price;
	 private int stockAmount;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	
	
	
	
	
}
