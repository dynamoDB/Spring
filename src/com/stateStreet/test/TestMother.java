package com.stateStreet.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stateStreet.service.Mother;


public class TestMother {
	
	public static void main(String[] args){
		String[] conf ={"applicationContext-ioc.xml"};
		ApplicationContext ac = 
        new ClassPathXmlApplicationContext(conf);
		Mother mother=(Mother)ac.getBean("mother1");
		mother.execute();
	}
}
