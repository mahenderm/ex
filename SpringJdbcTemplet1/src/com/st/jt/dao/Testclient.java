package com.st.jt.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testclient {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmpDao emp=(EmpDao)context.getBean("empDao");
		
		emp.saveUser();
		
		
	}

}
