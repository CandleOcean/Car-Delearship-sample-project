package car_dealership;

public class CarDealershipApplication {
// Is Dealership a Customer - NO ---inheritance
	//A Rabbit is an Animal. Class Rabbit extends Animal
	public static void main(String[] args) {
		Customer cust1 = new Customer();
		cust1.setName("candle ocean");
		cust1.setAddress("21st Ave. Streeet");
		cust1.setCashOnHand(12000);
		
		Employee emp1 = new Employee();
		emp1.setName("Joseph");
		
		Vehicle vehicle1 = new Vehicle();
		vehicle1.setName("convertible");
		vehicle1.setPrice(10000);

		emp1.handleCustomer(cust1, false, vehicle1);

		//purchaseCar(vehicle1.getName(), emp1.name, true);

	}

}
