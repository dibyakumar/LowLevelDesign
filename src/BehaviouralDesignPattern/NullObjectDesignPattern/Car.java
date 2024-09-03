package BehaviouralDesignPattern.NullObjectDesignPattern;

public class Car implements Vehicle{

	@Override
	public int seatingcapacity() {
		return 5;
	}

	@Override
	public int milage() {
		return 15;
	}
	
}
