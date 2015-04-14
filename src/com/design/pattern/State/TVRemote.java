package com.design.pattern.State;

/**
 * Created by karenlin on 2015/4/14.
 */
public class TVRemote {
	private String state = "";

	public void setState(String state){
		this.state = state;
	}

	public void doAction(){
		if(state.equalsIgnoreCase("ON")){
			System.out.println("TV is turned ON");
		}else if(state.equalsIgnoreCase("OFF")){
			System.out.println("TV is turned OFF");
		}
	}

	public static void main(String args[]){
		TVRemote tvRemote = new TVRemote();

		tvRemote.setState("ON");
		tvRemote.doAction();

		tvRemote.setState("OFF");
		tvRemote.doAction();
	}
}
