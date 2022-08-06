package car_dealership;

public class Customer extends Person{

	private double cashAtHand;

	public Customer() {
	}

	public Customer(String name, String address, double cashOnHand ) {
		super(name, address);
		this.cashAtHand = cashOnHand;
	}


	public double getCashOnHand() {
		return cashAtHand;
	}
	public void setCashOnHand(double cashAtHand) {
		this.cashAtHand = cashAtHand;
	}

    // But this still violates the principle of Single Responsibility which 'S' in SOLID principles
	public Vehicle purchaseCar(Vehicle vehicle, Employee emp, boolean isFinanced) {
		Vehicle vehicleToPurchase = new Vehicle();
		if (isFinanced) {
			//what do you do?
		} else {
			//what do you do?
		}
		return vehicle;
		
	}
}
