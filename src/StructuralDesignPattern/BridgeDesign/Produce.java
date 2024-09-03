package StructuralDesignPattern.BridgeDesign;

public class Produce implements WorkShop{

	@Override
	public void work() {
		System.out.println("Produced");
	}

}
