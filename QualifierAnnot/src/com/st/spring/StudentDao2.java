package com.st.spring;

import org.springframework.stereotype.Component;

@Component
public class StudentDao2 implements StudentDaoI {
	
	private StudentDaoI studentDaoI;
	

	public void m1() {

		System.out.println("Iam student dao2");
		
		
	}

}
