package StructuralDesignPattern.FacadeDesign;

public class FacadeDesignPattern {
	
public static void main(String[] args) {
	/**
	 * Hotel keeper will act as  a Facade
	 * Hotel keeper will have all the menus of diff restaurants
	 * Client will interact with hotel keeper instead of all the restaurants directly
	 * 
	 *    Hotel keeper is a Facade Here 
	 */
	
	// facade
	HotelKeeper hotelKeeper = new HotelKeeper();
	
	hotelKeeper.getVegMenu();
	hotelKeeper.getNonVegMenu();
	hotelKeeper.getVegNonvegMenu();
}

}
