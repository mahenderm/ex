package com.st.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class StudentService { 
	@Autowired
	@Qualifier("std1")
	private StudentDaoI studentDaoI;

	public StudentDaoI getStudentDaoI() {
		return studentDaoI;
	}

	
	
	public void setStudentDaoI(StudentDaoI studentDaoI) {
		this.studentDaoI = studentDaoI;
	}



	public void m1() {
		studentDaoI.m1();
	}

}
