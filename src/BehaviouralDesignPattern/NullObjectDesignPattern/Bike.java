package BehaviouralDesignPattern.NullObjectDesignPattern;

public class Bike implements Vehicle{

	@Override
	public int seatingcapacity() {
		return 2;
	}

	@Override
	public int milage() {
		return 40;
	}

}
