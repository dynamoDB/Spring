package com.stateStreet.service;

public class MotherImpl1 implements Mother{
	private Friend f;
	public MotherImpl1(Friend f){
		this.f=f;
	}
	
	public void execute() {
		f.makeFriend();
	}
}
