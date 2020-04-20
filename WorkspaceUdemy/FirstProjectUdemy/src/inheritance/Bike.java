package inheritance;

public class Bike extends Vehicle {
	
	int numberOfSeats = 2;
	
	public void kickStart() {
		System.out.println("kickstarting...");
	}

  public int getNumberOfSeats() {
		return numberOfSeats;
	}

}
