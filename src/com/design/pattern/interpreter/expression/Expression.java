package com.design.pattern.interpreter.expression;

import java.util.Map;

import com.design.pattern.interpreter.InterpreterException;

public interface Expression {
	public double interpret(Map<String, Double> context) throws InterpreterException;
}
