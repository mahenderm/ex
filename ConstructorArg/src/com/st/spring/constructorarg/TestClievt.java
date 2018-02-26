package com.st.spring.constructorarg;


import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;




public class TestClievt {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp=(Employee)context.getBean("emp");
/*BeanFactory beans=new XmlBeanFactory(new FileSystemResource("src/applicationContext.xml"));
		
		Employee emp=(Employee)beans.getBean("emp");*/
		
		
		System.out.println(emp);
		
	
	
	}

}
