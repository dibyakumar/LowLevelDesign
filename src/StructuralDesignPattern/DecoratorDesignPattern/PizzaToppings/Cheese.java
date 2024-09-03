package StructuralDesignPattern.DecoratorDesignPattern.PizzaToppings;

import StructuralDesignPattern.DecoratorDesignPattern.BasePizza.BasePizza;

public class Cheese extends Toppings{
	
	private BasePizza basepizza;
	
	public Cheese(BasePizza basepizza) {
		this.basepizza = basepizza;
	}
	
	@Override
	public int cost() {
		return basepizza.cost()+30;
	}

}
