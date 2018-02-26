package com.st.springjd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.st.springjd.pojo.EmployeePojo;
import com.st.springjd.service.EmpService;

@Component
public class EmpController {
	@Autowired
	private EmpService empService;
	
	public void save(EmployeePojo employeePojo) {
		empService.save(employeePojo);
		
	}
	
	

}
