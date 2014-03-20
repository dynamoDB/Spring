package com.stateStreet.test;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stateStreet.service.UserService;

public class TestUserService {
	public static void main(String[] args) {
		String conf = "applicationContext.xml";
		AbstractApplicationContext ac = 
        new ClassPathXmlApplicationContext(conf);
		//System.out.println("------");
		//UserService userService=(UserService)ac.getBean("userService");
		//userService.regist();
		
		ac.close();
		
	}
}
