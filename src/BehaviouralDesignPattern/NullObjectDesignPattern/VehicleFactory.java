package BehaviouralDesignPattern.NullObjectDesignPattern;

public class VehicleFactory {
	
	static Vehicle getVehicleObject(String typeOfObject) {
		if("Car".equals(typeOfObject)) {
			return new Car();
		}
		else if("Bike".equals(typeOfObject)) {
			return new Bike();
		}
		else {
			return new NullVehicleObject();
		}
	}

}
