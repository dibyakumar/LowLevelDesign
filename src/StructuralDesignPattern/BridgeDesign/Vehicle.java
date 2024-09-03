package StructuralDesignPattern.BridgeDesign;

public abstract class Vehicle {
	protected WorkShop workshop1;
	protected WorkShop workshop2;
	
	public Vehicle(WorkShop workshop1,WorkShop workshop2) {
		this.workshop1 = workshop1;
		this.workshop2 = workshop2;
	}
	
	public abstract void manufacture();
}
