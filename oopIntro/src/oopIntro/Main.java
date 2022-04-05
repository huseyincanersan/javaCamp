package oopIntro;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB ram", 10); // Ornek olusturma, intance
		Product product2 = new Product();
		Product product3 = new Product();

		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);

		product3.setId(2);
		product3.setName("Hp 5");
		product3.setDetail("8 GB Ram");
		product3.setDiscount(10);
		product3.setUnitPrice(10000);

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getUnitPrice());
			System.out.println(product.getDetail());
			System.out.println(product.getDiscount());
			System.out.println(product.getUnitPriceAfterDiscount());
			System.out.println("---------");
		}

		Category category1 = new Category();
		Category category2 = new Category();

		category1.setId(395);
		category1.setName("Pc");
		
		category2.setId(396);
		category2.setName("Kýrtasiye");
		
		Category[] categorys = { category1, category2 };

		for (Category category : categorys) {
			System.out.println(category.getId());
			System.out.println(category.getName());
			System.out.println("-------------");
		}

		ProductManager productmanager = new ProductManager();

		productmanager.addToCart(product1);

		productmanager.addToCart(product2);

		productmanager.addToCart(product3);

	}

}
