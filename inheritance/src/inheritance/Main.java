package inheritance;

public class Main {

	public static void main(String[] args) {
		 IndividualCustomer can = new IndividualCustomer();
		 
		 can.customerNumber="12345";

		 CorporateCustomer hepsiburada = new CorporateCustomer();
		
		hepsiburada.customerNumber="78910";
		
		CustomerManager customerManager = new CustomerManager();
		
		//customerManager.add(hepsiburada);          //tek tek ekleme
		//customerManager.add(can);
		
		Customer[] customers = {can,hepsiburada};
		
		
		customerManager.addMultiple(customers);    //multi ekleme
	}

}
