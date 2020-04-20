package inheritance;

public class Car extends Vehicle {
	
	int numberOfSeats = 4;

	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	
	public void restart() {
		System.out.println("the car is restart...");
	}

}
