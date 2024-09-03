package StructuralDesignPattern.CompositeDesignPattern.ArithmaticExpressionEvaluation;

public class Main {
/**
 * Composite Design 
 * 
 * evaluating expression 
 * 
 */
	public static void main(String[] args) {
		
		
		// 2 + (2*7)
		
		Number two = new Number(2);
		
		Number seven = new Number(7);
		
		Expression expression = new Composite(two, new Composite(two, seven, Operation.MUL), Operation.ADD);
		
		System.out.println("2 + (2 * 7) = "+expression.evaluate());
		
	}
}
