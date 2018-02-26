package com.st.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public interface StudentDaoI {
	@Autowired
	@Qualifier
	public void m1();
	
	}


