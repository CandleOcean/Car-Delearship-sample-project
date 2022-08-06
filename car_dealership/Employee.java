package car_dealership;

public class Employee extends Person{
	
	public void handleCustomer(Customer cust, boolean isFinancedPayment, Vehicle vehicle) {
		if(isFinancedPayment) {
			runCreditHistory(cust, cust.getCashOnHand());
		} else if(vehicle.getPrice() <= cust.getCashOnHand()) {
			processTransaction(cust, vehicle);
			
		}else {
			System.out.println("Add on your money to get yourself a car of your choice");
		}
	}
	
	public void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("Running the customers credit history");
	}
	
	public void processTransaction(Customer cust1, Vehicle vehicle) {
		System.out.println(cust1.getName()+" just bought himself a " + vehicle.getName());

	}

}
