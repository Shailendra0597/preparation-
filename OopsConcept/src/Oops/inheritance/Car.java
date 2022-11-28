package Oops.inheritance;

public class Car {

	int cardId;
	String carName;
	int carAirBags;

	public void setCarId(int carId) {
		this.cardId = cardId;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarName() {
		return carName;
	}

	public int getCarAirBags() {
		return carAirBags;
	}

	public void setCarAirBags(int carAirBags) {
		this.carAirBags = carAirBags;
	}

	public static void main(String[] args) {
		SuperCar s = new SuperCar();

		s.setCarName("lambo");

		System.out.println(s.getCarName());
	}

}

class SuperCar extends Car {
	int superCarSpeed;

}
