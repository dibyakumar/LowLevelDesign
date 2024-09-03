package StructuralDesignPattern.DecoratorDesignPattern.PizzaToppings;

import StructuralDesignPattern.DecoratorDesignPattern.BasePizza.BasePizza;

public class Veggies extends Toppings{
	
	private BasePizza basePizza;
	
	public Veggies(BasePizza basepizza) {
		this.basePizza = basepizza;
	}
	
	@Override
	public int cost() {
		return basePizza.cost()+15;
	}

}
