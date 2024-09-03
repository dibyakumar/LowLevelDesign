package StructuralDesignPattern.BridgeDesign;

public class BridgeDesignPattern {
public static void main(String[] args) {
	/**
	 * In this design we will decouple Abstraction from its implementation 
	 * 
	 * in case of abstraction we extend the abstract class to implement the abstract method ,
	 * that means some time if we need a different implementation for an abstract method that time we again have to
	 * extend the abstract class to a different class .
	 * 
	 * but what if we need an different implementation , its not possible as to give implementation we have to extend.
	 * 
	 * 
	 * to solve this problem we are going to use Bridge design ,
	 * 
	 * 
	 */
	
	/*
	 * 
	 * E.g 
	 * 
	 * Here we will take an example of vehicle manufacturer which will make a vehicle in different different 
	 * workshops . 
	 * 
	 * 
	 */
	
	
	Car car = new Car(new Produce(),new Assemble());
	Bike bike = new Bike(new Produce(),new Assemble());
	
	car.manufacture();
	bike.manufacture();
}
}
