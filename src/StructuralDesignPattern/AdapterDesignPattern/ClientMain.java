package StructuralDesignPattern.AdapterDesignPattern;

public class ClientMain {
	
	/**
	 * AdapterDesignPattern 
	 * 
	 * crating a design where two incompatible interfaces are going to communicate using adapter
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// adaptee
		UsWeightMachine usMachine  = new UsWeightMachineImpl();
		
		// adapter
		IndianWeightMachine indianWeightMachine = new Adapter(usMachine);
		
		System.out.println(indianWeightMachine.weightInKG()+"KG");
		
	}

}
