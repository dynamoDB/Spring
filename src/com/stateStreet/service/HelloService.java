package com.stateStreet.service;

public class HelloService {
	
	
	//��ֹʹ����ȥnew����
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
