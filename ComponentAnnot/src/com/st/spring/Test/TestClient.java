package com.st.spring.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.st.spring.controller.UserController;
import com.st.spring.da0.UserDao;
import com.st.spring.service.UserService;


public class TestClient {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//UserController uc=(UserController)context.getBean("userController");
		//UserService us=(UserService)context.getBean("userService");
		UserDao ud=(UserDao)context.getBean("userDao");
		ud.saveUser();
		
	
		
	}

}
