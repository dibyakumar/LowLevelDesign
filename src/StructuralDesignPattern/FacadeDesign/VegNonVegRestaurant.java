package StructuralDesignPattern.FacadeDesign;

public class VegNonVegRestaurant implements Hotel{

	@Override
	public void getMenus() {
		System.out.println("Dal");
		System.out.println("Mix Veg");
		System.out.println("Panneer Butter masala");
		System.out.println("Chicken Curry");
		System.out.println("Chicken makhnnee ");
		System.out.println("Chicken kosha");
	}

}
