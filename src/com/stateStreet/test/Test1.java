package com.stateStreet.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stateStreet.service.HelloService1;

public class Test1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ʵ����Spring��������
		String conf = "applicationContext.xml";
		AbstractApplicationContext ac = 
        new ClassPathXmlApplicationContext(conf);
		//�������л�ȡHelloService1�������
		System.out.println("�ڴ�֤��bean������ʲôʱ�򴴽���");
		HelloService1 hello = 
			(HelloService1)ac.getBean("hello");
		hello.say();
		HelloService1 hello1 = 
			(HelloService1)ac.getBean("hello");
		hello1.say();
		System.out.println(hello==hello1);
		ac.close();
	}
}
