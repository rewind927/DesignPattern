package com.design.pattern.interpreter;

import java.util.List;

import com.design.pattern.interpreter.expression.Expression;
import com.design.pattern.interpreter.parser.Parser;
import com.design.pattern.interpreter.parser.Token;
import com.design.pattern.interpreter.parser.Tokenizer;

public class Interpreter {
	
	private final List<Token> tokens;
	private final Expression rootExpression;

	public Interpreter(String expressionString) throws InterpreterException {
		tokens = Tokenizer.tokenize(expressionString);
		rootExpression = Parser.parse(tokens);
	}

	public List<Token> getTokens() {
		return tokens;
	}

	public Expression getRootExpression() {
		return rootExpression;
	}

}
