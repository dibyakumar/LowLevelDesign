package BehaviouralDesignPattern.NullObjectDesignPattern;

public class Main {
	public static void main(String[] args) {
		// safe
		Vehicle car = VehicleFactory.getVehicleObject("Car");
		Vehicle bike = VehicleFactory.getVehicleObject("Bike");
		
		// No Such object present so instead of null we will get a NullObject with default behavior
		Vehicle bicycle = VehicleFactory.getVehicleObject("Cycle");
		
		print(car);
		print(bike);
		print(bicycle);
		
	}
	
	private static void print(Vehicle v) {
		System.out.println(v.seatingcapacity());
		System.out.println(v.milage());
	}
}
