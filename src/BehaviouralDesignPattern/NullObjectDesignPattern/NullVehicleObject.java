package BehaviouralDesignPattern.NullObjectDesignPattern;

public class NullVehicleObject implements Vehicle{

	@Override
	public int seatingcapacity() {
		return 0;
	}

	@Override
	public int milage() {
		return 0;
	}

}
