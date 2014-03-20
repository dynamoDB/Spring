package com.stateStreet.test;

import com.stateStreet.service.HelloService;

public class Test {
	public static void main(String[] args) {
		HelloService service=HelloService.getInstance();
		service.say();
		HelloService service2=HelloService.getInstance();
		service2.say();
		System.out.println(service==service2);
	}
}
