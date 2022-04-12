package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager custome = new CustomerManager();
		
		custome.databaseManager = new MySqlDatabase();
		
		custome.getCustomers();

	}

}
