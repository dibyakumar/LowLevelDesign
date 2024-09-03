package StructuralDesignPattern.FlyWeightDesignPattern;

public class Terrorist implements Player{
	// intrinsic data (as this will never change for this particular class)
	public final String TASK;
	// extrinsic data as it will change based upon user input
	public String weapon;
	
	public Terrorist() {
		System.out.println("Inside Terrorist Constructor");
		TASK = "Place BOMB";
	}
	
	@Override
	public void getMission() {
		System.out.println("Terrorist with Weapon "+this.weapon+" "+"Performing Task "+this.TASK);
	}

	@Override
	public void assignWeapon(String weapon) {
		this.weapon = weapon;
	}

}
