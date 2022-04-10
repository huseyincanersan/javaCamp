package interfaces;

public class Main {

	public static void main(String[] args) {
			
			Logger[] loggers = { new SmsLogger(), new EmailLogger()};
		
			CustomerManager customerManager = new CustomerManager(loggers);
			
			
			Customer can = new Customer(1,"Can","Ersan");
			
		
			
			customerManager.add(can);
		

	}

}
