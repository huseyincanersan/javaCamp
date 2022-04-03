package oopIntro;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(1,"Lenovo V14", 15000,"16 GB ram"); // Ornek olusturma, intance
		Product product2 = new Product(2,"Lenovo V15",10000,"8 gb ram"); 
		Product product3 = new Product(3,"HP 5",20000,"32 GB RAM");
 
		
		Product[] products = { product1, product2, product3 };

		// System.out.println(products.length);

		for (Product product : products) {
			System.out.println(product.id);
			System.out.println(product.name);
			System.out.println(product.unitPrice);
			System.out.println(product.detail);
			System.out.println("---------");
		}
		
		Category category1 = new Category();
		Category category2 = new Category();
		
		category1.id=385;
		category1.name="Pc";
		
		
		category2.id=386;
		category2.name="Home";
		
		Category[] categorys = {category1,category2};
		
		for (Category category : categorys) {
			System.out.println(category.id);
			System.out.println(category.name);
			System.out.println("-------------");
		}
		
		ProductManager productmanager = new ProductManager();
		
		productmanager.addToCart(product1);
		
		productmanager.addToCart(product2);
		
		productmanager.addToCart(product3);
		

	}

}
