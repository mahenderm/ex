package com.st.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class StudentDao1 implements StudentDaoI {
	@Qualifier("std1")
	
	private StudentDaoI studentDaoI;
	public void m1() {
	
		System.out.println("iam student");
		
	}
	

}
