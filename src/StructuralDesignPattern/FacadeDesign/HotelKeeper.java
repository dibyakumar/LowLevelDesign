package StructuralDesignPattern.FacadeDesign;

public class HotelKeeper {
	VegRestaurant veg = new VegRestaurant();
	NonVegRestaurant nonVeg = new NonVegRestaurant();
	VegNonVegRestaurant vegNon = new VegNonVegRestaurant();
	
	public void getVegMenu() {
		veg.getMenus();
	}
	
	public void getNonVegMenu() {
		nonVeg.getMenus();
	}
	
	public void getVegNonvegMenu() {
		vegNon.getMenus();
	}
}
