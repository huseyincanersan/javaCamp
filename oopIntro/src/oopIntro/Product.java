package oopIntro;

public class Product {
	
	public Product() {
		System.out.println("Ben �al��t�m");
	}
	
	public Product(int id,String name, double unitPrise, String detail) {
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrise;
		this.detail = detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
	
	
}
