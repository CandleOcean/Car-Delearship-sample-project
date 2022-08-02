package car_dealership;

public class Employee extends Customer{
	String name;
	
	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		if(finance == true) {
			runCreditHistory(cust1.getName(), cust1.getCashOnHand());
		}else if(vehicle.getPrice() <= cust1.getCashOnHand()) {
			processTransaction(cust1.getName(), vehicle.getName());
			
		}else {
			System.out.println("Add on your money to get yourself a car of your choice");
		}
	}
	
	public void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println(cust1.getName()+" just bought himself a " + vehicle1.getName);
	}
	
	public void processTransaction(Customer cust1, Vehicle vehicle) {
		
	}

}
