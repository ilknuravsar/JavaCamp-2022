package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		//Product product = new Product(1, name="Laptop", description="Asus", price= 290000, stockAmount=3);
		Product product = new Product();
		product.name = "Telefon";
		product.setId(3);
		product.setDescription("Asus");
		product.setPrice(290000);
		product.setStockAmount(6);
		
		System.out.println(product.name);
		System.out.println(product.getId());
		System.out.println(product.getDescription());
		System.out.println(product.getPrice());

		ProductManager pManager = new ProductManager();
		pManager.Add(product);
		
		
		
	}

}
