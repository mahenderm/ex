package com.st.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student s= (Student)context.getBean("s");
		
		
		System.out.println(s.getSno());
		System.out.println(s.getSname());
		System.out.println(s.getAddress());
		
		
	
		
	}

}
