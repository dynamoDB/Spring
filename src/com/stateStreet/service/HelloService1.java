package com.stateStreet.service;
    
public class HelloService1 {
	
	public HelloService1(){
		System.out.println("service constructor");
	}
	
	public void init(){
		System.out.println("service init");
	}
	
	public void destroy(){
		System.out.println("service destory");
	}
	
	public void say(){
		System.out.println("service say...");
	}
}   