package StructuralDesignPattern.BridgeDesign;

public class Assemble implements WorkShop{

	@Override
	public void work() {
		System.out.println("Assembled");
	}

}
