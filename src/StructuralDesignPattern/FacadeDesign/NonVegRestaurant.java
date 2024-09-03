package StructuralDesignPattern.FacadeDesign;

public class NonVegRestaurant implements Hotel{

	@Override
	public void getMenus() {
		System.out.println("Chicken Curry");
		System.out.println("Chicken makhnnee ");
		System.out.println("Chicken kosha");
	}

}
