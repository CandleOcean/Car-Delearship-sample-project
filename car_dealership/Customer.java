package car_dealership;

public class Customer {
	 private String name;
	 private String address;
	 private double cashOnHand;
	
	//Add a constructor 

	//Getter and Setters down ok
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getCashOnHand() {
		return cashOnHand;
	}
	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
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
