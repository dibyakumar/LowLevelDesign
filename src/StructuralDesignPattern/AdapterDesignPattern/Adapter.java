package StructuralDesignPattern.AdapterDesignPattern;

public class Adapter implements IndianWeightMachine {

	private UsWeightMachine usWeightMachine;
	
	public Adapter(UsWeightMachine usWeightMachine) {
		this.usWeightMachine = usWeightMachine;
	}
	
	@Override
	public double weightInKG() {
		
		double weightInKg = usWeightMachine.weightInPOUND() * 0.45;
		return weightInKg;
	}

}
