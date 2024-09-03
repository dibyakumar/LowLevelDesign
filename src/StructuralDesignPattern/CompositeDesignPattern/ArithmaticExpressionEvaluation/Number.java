package StructuralDesignPattern.CompositeDesignPattern.ArithmaticExpressionEvaluation;

public class Number implements Expression{

	int data;
	
	public Number(int data) {
		this.data= data;
	}
	
	@Override
	public int evaluate() {
		return data;
	}
	

}
