package inheritance;

public class TestInheritance {

	public static void main(String[] args) {
//		Car tesla = new Car();
//		tesla.start();
//		tesla.stop();
//		tesla.restart();
//		System.out.println(tesla.getNumberOfSeats());

//		Vehicle car = new Car();
//		car.start();
//		car.stop();

//		Bike bike = new Bike();
//		bike.getNumberOfSeats();
//		bike.start();
//		bike.stop();

		Car car = new Car();
		Vehicle vehicle = car; // upcasting
		vehicle.start();
		Car car2 = (Car) vehicle; // downcasting
		System.out.println(car2.getNumberOfSeats());
		car2.restart();

		Bike bike = new Bike(); // say Bike is also a subclass of Vehicle
		bike.getNumberOfSeats();
		bike.kickStart();
		Vehicle vehicle2 = bike; // upcasting, no problem here.
		vehicle2.start();
		vehicle2.stop();
//		Car car3 = (Car) bike; // Compilation Error : as bike is NOT a instance of Car
		Car car3 = (Car) vehicle2; // this is good...
		System.out.println(car3.getNumberOfSeats());
		car3.restart();

	}

}
