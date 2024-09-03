package StructuralDesignPattern.FacadeDesign;

public class VegRestaurant implements Hotel{

	@Override
	public void getMenus() {
		System.out.println("Dal");
		System.out.println("Mix Veg");
		System.out.println("Panneer Butter masala");
	}

}
