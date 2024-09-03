package StructuralDesignPattern.FlyWeightDesignPattern;

public class Hero implements Player{
	// intrinsic data (as this will never change for this particular class)
		public final String TASK;
		// extrinsic data as it will change based upon user input
		public String weapon;
		
		public Hero() {
			System.out.println("Inside Hero Constructor");
			TASK = "Find The Bomb and Deactivate it .";
		}
		
		@Override
		public void getMission() {
			System.out.println("Hero with Weapon "+this.weapon+" "+"Performing Task "+this.TASK);
		}

		@Override
		public void assignWeapon(String weapon) {
			this.weapon = weapon;
		}

}
