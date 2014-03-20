package com.stateStreet.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stateStreet.service.MessageBean;

public class TestMessage {
	public static void main(String[] args) {
		String conf ="applicationContext-ioc.xml";
		ApplicationContext ac = 
		new ClassPathXmlApplicationContext(conf);
		MessageBean message=(MessageBean)ac.getBean("message");
		message.show();
	}
}
