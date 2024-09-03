package StructuralDesignPattern.DecoratorDesignPattern;

import StructuralDesignPattern.DecoratorDesignPattern.BasePizza.BasePizza;
import StructuralDesignPattern.DecoratorDesignPattern.BasePizza.MultiGrain;
import StructuralDesignPattern.DecoratorDesignPattern.PizzaToppings.Cheese;
import StructuralDesignPattern.DecoratorDesignPattern.PizzaToppings.Mushroom;
import StructuralDesignPattern.DecoratorDesignPattern.PizzaToppings.Veggies;

public class Main {
	/**
	 * 
	 * Pizza decorator 
	 * 
	 * we can add toppings in our base pizza and customize it .
	 * 
	 */
	public static void main(String[] args) {
		
		BasePizza pizza = new Cheese(new Mushroom(new Veggies(new MultiGrain())));
		System.out.println("Totla Cost of Pizzza : "+ pizza.cost());
		
	}

}
