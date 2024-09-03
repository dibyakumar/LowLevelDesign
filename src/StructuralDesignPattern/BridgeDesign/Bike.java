package StructuralDesignPattern.BridgeDesign;

public class Bike extends Vehicle {
	public Bike(WorkShop w1, WorkShop w2) {
		super(w1, w2);
	}

	@Override
	public void manufacture() {
		System.out.println("Bike");
		workshop1.work();
		workshop2.work();
	}
}
