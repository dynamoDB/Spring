package com.stateStreet.service;

public class HelloService {
	
	
	//禁止使用者去new对象
	private static HelloService instance=new HelloService();
	
	private HelloService(){
	}
	
	public static HelloService getInstance(){
		return instance;
	}
	
	
	public void say(){
		System.out.println("hello, my sweet!");
	}
}
