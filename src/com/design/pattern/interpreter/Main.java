package com.design.pattern.interpreter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.design.pattern.interpreter.parser.Token;

public class Main {

	static final boolean VERBOSE_PARSE = false;
	static final boolean VERBOSE_DEBUG = false;
	static final double EPS = 1e-7;
	static final Map<String, Double> context = new HashMap<String, Double>();
	static {
		context.put("age", 18.0);
		context.put("height", 170.0);
	}

	private static void execute(String expressionString, double excepted) {
		System.out.println("Attempting to evaluate: " + expressionString);
		try {
			Interpreter interpreter = new Interpreter(expressionString);
			if (VERBOSE_PARSE) {
				printTokens(interpreter.getTokens());
				System.out.println("Parse tree: "
						+ interpreter.getRootExpression());
			}
			double value = interpreter.getRootExpression().interpret(context);
			boolean correct = Math.abs(value - excepted) < EPS;
			System.out.println(String.format(
					"* %s!! Excepted: %.4f, evaluated: %.4f",
					correct ? "Correct" : "Incorrect", excepted, value));
		} catch (InterpreterException e) {
			System.out.println("Error: " + e);
			if (VERBOSE_DEBUG) {
				e.printStackTrace();
			}
		}
	}

	private static void printTokens(List<Token> tokens) {
		StringBuffer buffer = new StringBuffer("Tokens: ");
		for (Token token : tokens) {
			buffer.append(token);
		}
		System.out.println(buffer);
	}

	public static void main(String[] args) {
		execute("1.5", 1.5);
		execute("1 + 2 + 3 + 4 + 5", 1 + 2 + 3 + 4 + 5);
		execute("2 * 3 + 5 * 7", 2 * 3 + 5 * 7);
		execute("age * 10 + height * 1.5", get("age") * 10 + get("height") * 1.5);
	}

	public static double get(String key) {
		return context.get(key);
	}
}
