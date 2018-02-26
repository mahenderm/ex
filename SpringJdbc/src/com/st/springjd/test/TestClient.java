package com.st.springjd.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.st.springjd.controller.EmpController;

public class TestClient {
	
	public static void main(String[] args) {
		

		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmpController ec=(EmpController)context.getBean("empController");
		ec.save(null);
		
		
	}
	
	

}
