package com.design.pattern.State;

/**
 * Created by karenlin on 2015/4/14.
 */
public class TVRemote {
	public static void main(String[] args) {

		TVContext context = new TVContext();

		context.setState(new TVStartState());
		context.doAction();

		context.setState(new TVStopState());
		context.doAction();

	}
}
