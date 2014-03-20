package com.stateStreet.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stateStreet.service.HelloService1;

public class Test1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//实例化Spring容器对象
		String conf = "applicationContext.xml";
		AbstractApplicationContext ac = 
        new ClassPathXmlApplicationContext(conf);
		//从容器中获取HelloService1组件对象
		System.out.println("在此证明bean对象是什么时候创建的");
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
