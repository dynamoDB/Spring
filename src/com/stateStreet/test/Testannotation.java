package com.stateStreet.test;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.stateStreet.service.Mother;

public class Testannotation {
	public static void main(String[] args) {
		String conf ="applicationContext-annotation.xml";
		ApplicationContext ac = 
		new ClassPathXmlApplicationContext(conf);
		
		Resource resource= new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Mother m=(Mother)ac.getBean("mymother");
		m.execute();
	}
}
