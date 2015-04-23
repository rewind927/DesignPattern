package com.design.pattern.interpreter.parser;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.design.pattern.interpreter.InterpreterException;
import com.design.pattern.interpreter.parser.Token.TokenType;

public class Tokenizer {
	private static class TokenRule {
		private final Pattern pattern;
		private final TokenType type;

		public TokenRule(String pattern, TokenType type) {
			this.pattern = Pattern.compile(pattern);
			this.type = type;
		}

		public Pattern getPattern() {
			return pattern;
		}

		public TokenType getType() {
			return type;
		}
	}

	private static final List<TokenRule> rules = new ArrayList<TokenRule>();
	static {
		rules.add(new TokenRule("^\\d+(\\.\\d+)?", TokenType.NUMBER));
		rules.add(new TokenRule("^[ \t\n\r]+", TokenType.SPACE));
		rules.add(new TokenRule("^\\+", TokenType.ADD));
		rules.add(new TokenRule("^\\*", TokenType.MULTIPLY));
		rules.add(new TokenRule("^[A-Za-z][A-Za-z0-9]*", TokenType.VARIABLE));
	}

	public static List<Token> tokenize(String exprStr) throws InterpreterException {
		Tokenizer tokenizer = new Tokenizer(exprStr);
		return tokenizer.tokenize();
	}

	private final String exprStr;

	private Tokenizer(String exprStr) {
		this.exprStr = exprStr;
	}

	private List<Token> tokenize() throws InterpreterException {
		List<Token> tokens = new ArrayList<Token>();
		int pos = 0;
		int len = exprStr.length();
		while (pos < len) {
			CharSequence sequence = exprStr.subSequence(pos, len);
			boolean matched = false;
			for (TokenRule rule : rules) {
				Matcher matcher = rule.getPattern().matcher(sequence);
				if (!matcher.find()) {
					continue;
				}
				matched = true;
				pos += matcher.end();
				TokenType type = rule.getType();
				if (type != TokenType.SPACE) {
					Token token = new Token(type, matcher.group());
					tokens.add(token);
				}
				break;
			}
			if (!matched) {
				throw new InterpreterException("Tokenizer error at: \"" + sequence + "\"");
			}
		}
		tokens.add(new Token(TokenType.EPSILON, ""));
		return tokens;
	}
}
