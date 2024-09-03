package StructuralDesignPattern.BridgeDesign;

public class Car extends Vehicle{
	public Car(WorkShop w1,WorkShop w2) {
			super(w1,w2);
	}
	
	@Override
	public void manufacture() {
		System.out.println("Car");
		workshop1.work();
		workshop2.work();
	}

}
