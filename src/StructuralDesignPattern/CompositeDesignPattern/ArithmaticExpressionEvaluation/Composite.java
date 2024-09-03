package StructuralDesignPattern.CompositeDesignPattern.ArithmaticExpressionEvaluation;

public class Composite implements Expression{

	private Expression left;
	private Expression right;
	private Operation operation;
	
	
	public Composite(Expression left , Expression right , Operation operation) {
		this.left = left;
		this.right = right;
		this.operation = operation;
	}
	
	@Override
	public int evaluate() {
		switch (operation) {
		case ADD: 
			return left.evaluate() + right.evaluate();
		case MUL :
			return left.evaluate() * right.evaluate();
		case SUB :
			return left.evaluate() - right.evaluate();
			
		case DIV:
			return left.evaluate() / right.evaluate();
			
		default:
			throw new IllegalArgumentException("Unexpected value: " );
		}
	}
	
	
}
