package StructuralDesignPattern.FlyWeightDesignPattern;

public class FlyWeight {
public static void main(String[] args) {
	/**
	 * main objective is to reduce the object count by caching the object 
	 * 
	 *  we will create a game where Terrorist and Counter Terrorist will be there 
	 *  we will cache the Player to reuse them .
	 *  Every player can have any desired weapon .
	 *  
	 *   Player Type -> intrinsic data 
	 *   Player weapon -> extrinsic data 
	 *   
	 */
	// here only one time object creating will happen 
	for(int i=0;i<10;i++) {
	Player terrorist = PlayerFactory.getPlayer("Terrorist");
	terrorist.assignWeapon("AK-47");
	terrorist.getMission();
	
	Player hero = PlayerFactory.getPlayer("Hero");
	hero.assignWeapon("Machine Gun");
	hero.getMission();
	}
}
}
