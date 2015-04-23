package com.design.pattern.interpreter.expression;

import java.util.Map;

import com.design.pattern.interpreter.InterpreterException;

public class VariableExpression implements Expression {

	private final String name;

	public VariableExpression(String name) {
		this.name = name;
	}

	@Override
	public double interpret(Map<String, Double> context) throws InterpreterException {
		if (context.containsKey(name)) {
			return context.get(name);
		} else {
			throw new InterpreterException("Variable not found: " + name);
		}
	}
	
	@Override
	public String toString() {
		return name;
	}

}
