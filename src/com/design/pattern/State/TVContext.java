package com.design.pattern.State;

/**
 * Created by karenlin on 2015/4/14.
 */
public class TVContext {
	private State state;

	public void setState(State state) {
		this.state = state;
	}

	public void doAction() {
		this.state.doAction();
	}
}
