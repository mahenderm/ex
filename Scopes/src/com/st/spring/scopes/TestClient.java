package com.st.spring.scopes;

import java.nio.file.FileSystem;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class TestClient {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//BeanFactory beans=new XmlBeanFactory(new FileSystemResource("src/applicationContext.xml"));
		/*
		Employee emp=(Employee)beans.getBean("emp");
		Employee emp1=(Employee)beans.getBean("emp");
		Employee emp2=(Employee)beans.getBean("emp");
		*/
		Employee emp=(Employee)context.getBean("emp");
		Employee emp1=(Employee)context.getBean("emp");
		System.out.println(emp);
		
		Student s=(Student)context.getBean("s");
		Student s2=(Student)context.getBean("s");
		
		/*Student s=(Student)beans.getBean("s");
		Student s2=(Student)beans.getBean("s");*/
		
		
	}

}
