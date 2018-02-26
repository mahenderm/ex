package com.st.spring.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.st.spring.controller.UserController;
import com.st.spring.service.UserService;

public class TestClient {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserController uc=(UserController)context.getBean("uc");
		UserService us=(UserService)context.getBean("us");
		uc.saveUSer();
		uc.saveUSer();
		
	}

}
