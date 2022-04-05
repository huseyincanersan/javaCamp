package oopIntroClassesAttribute;

public class Product {

	public Product(){
		System.out.println("Yapýcý Blok");
	}
	
	// attribute || field
	private int _id;
	private String _name;
	private String _details;
	private double _price;
	private int _stock;
	private String _code;

	public int getId() {

		return _id;

	}

	public void setId(int id) {
		this._id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String _name) {
		this._name = _name;
	}

	public String getDetails() {
		return _details;
	}

	public void setdetails(String _details) {
		this._details = _details;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double _price) {
		this._price = _price;
	}

	public int getStock() {
		return _stock;
	}

	public void setStock(int _stock) {
		this._stock = _stock;
	}
	
	public String getCode() {
		return this._name.substring(0, 1) + _id;
	}

}
