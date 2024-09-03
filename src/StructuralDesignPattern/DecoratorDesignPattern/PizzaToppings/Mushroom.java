package StructuralDesignPattern.DecoratorDesignPattern.PizzaToppings;

import StructuralDesignPattern.DecoratorDesignPattern.BasePizza.BasePizza;

public class Mushroom extends Toppings{

	private BasePizza basePizza;
	
	public Mushroom(BasePizza basepizza) {
		this.basePizza = basepizza;
	}
	
	@Override
	public int cost() {
		return basePizza.cost()+20;
	}

}
