package com.design.pattern.interpreter.expression;

import java.util.Map;

public class NumberExpression implements Expression {
	
	private final double value;
	
	public NumberExpression(double value) {
		this.value = value;
	}

	@Override
	public double interpret(Map<String, Double> context) {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

}
