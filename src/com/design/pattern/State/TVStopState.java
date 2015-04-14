package com.design.pattern.State;

/**
 * Created by karenlin on 2015/4/14.
 */
public class TVStopState implements State {
	@Override
	public void doAction() {
		System.out.println("TV is turned OFF");
	}
}
