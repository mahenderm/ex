package com.st.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.st.spring.Dao.UserDao;
import com.st.spring.Pojo.UserPojo;

public class TestClient {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao ud=(UserDao)context.getBean("userDao");
		
		UserPojo userPojo=ud.getUser("slokam");
		System.out.println((userPojo.getId()));
		System.out.println(userPojo.getUsername());
		System.out.println(userPojo.getPassword());

	}

}
