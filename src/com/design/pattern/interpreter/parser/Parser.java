package com.design.pattern.interpreter.parser;

import java.util.List;

import com.design.pattern.interpreter.InterpreterException;
import com.design.pattern.interpreter.expression.AddExpression;
import com.design.pattern.interpreter.expression.Expression;
import com.design.pattern.interpreter.expression.MultiplyExpression;
import com.design.pattern.interpreter.expression.NumberExpression;
import com.design.pattern.interpreter.expression.VariableExpression;
import com.design.pattern.interpreter.parser.Token.TokenType;

public class Parser {
	private final List<Token> tokens;
	int next = 0;
	
	public static Expression parse(List<Token> tokens) throws InterpreterException {
		return new Parser(tokens).parse();
	}

	private Parser(List<Token> tokens) {
		this.tokens = tokens;
	}
	
	private Expression parse() throws InterpreterException {
		next = 0;
		Expression expression = expression();
		except(TokenType.EPSILON);
		return expression;
	}
	
	private Expression expression() throws InterpreterException {
		Expression expression = term();
		while (accept(TokenType.ADD)) {
			expression = new AddExpression(expression, term());
		}
		return expression;

	}
	
	private Expression term() throws InterpreterException {
		Expression expression = factor();
		while (accept(TokenType.MULTIPLY)) {
			expression = new MultiplyExpression(expression, term());
		}
		return expression;
	}
	
	private Expression factor() throws InterpreterException {
		if (accept(TokenType.NUMBER)) {
			return new NumberExpression(current().getAsNumber());
		}
		except(TokenType.VARIABLE);
		return new VariableExpression(current().getString());
	}
	
	private boolean accept(TokenType tokenType) {
		if (tokens.get(next).getType() == tokenType) {
			++next;
			return true;
		} else {
			return false;
		}
	}
	
	private void except(TokenType tokenType) throws InterpreterException {
		if (!accept(tokenType)) {
			throw new InterpreterException(
					"Parser error. Unexcepted token at: \""
							+ getRemainingString() + "\"");
		}
	}
	
	private Token current() {
		return tokens.get(next - 1);
	}
	
	private String getRemainingString() {
		StringBuffer buffer = new StringBuffer();
		for (int i = next; i < tokens.size(); ++i) {
			if (i != next)
				buffer.append(" ");
			buffer.append(tokens.get(i).getString());
		}
		return buffer.toString();
	}
	
}
