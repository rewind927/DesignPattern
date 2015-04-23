package com.design.pattern.interpreter.expression;

import java.util.Map;

import com.design.pattern.interpreter.InterpreterException;

public class AddExpression implements Expression {

	private final Expression leftExpression; 
	private final Expression rightExpression; 
	
	public AddExpression(Expression leftExpression, Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public double interpret(Map<String, Double> context) throws InterpreterException {
		return leftExpression.interpret(context) + rightExpression.interpret(context);
	}

	@Override
	public String toString() {
		return String.format("(%s + %s)", leftExpression, rightExpression);
	}

}
