public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.set_name("Laptop");
        product.set_desc("Asus");
        product.set_price(15000);

        ProductManager pManager = new ProductManager();
        //pManager.Add(product);
        //System.out.println(product.get_price());

        Product product1 = new Product(1,"Apple","Apple-2022",18000,9,"Grey", "1306");
        pManager.Add(product1);
        System.out.println(product1.get_renk());

    }
}