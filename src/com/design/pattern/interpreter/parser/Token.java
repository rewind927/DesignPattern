package com.design.pattern.interpreter.parser;

import com.design.pattern.interpreter.InterpreterException;

public class Token {
	public static enum TokenType {
		SPACE,
		NUMBER,
		ADD,
		MULTIPLY,
		VARIABLE,
		EPSILON, // The end of the entire expression.
	}
	
	private final TokenType type;
	private final String string;
	
	public Token(TokenType type, String string) {
		this.type = type;
		this.string = string;
	}

	@Override
	public String toString() {
		return String.format("(%s, \"%s\")", type, string);
	}

	public TokenType getType() {
		return type;
	}

	public String getString() {
		return string;
	}
	
	public double getAsNumber() throws InterpreterException {
		if (type != TokenType.NUMBER) {
			throw new InterpreterException("Incorrect token type. ");
		}
		return Double.valueOf(string);
	}
}
