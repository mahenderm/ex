package com.st.springjd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Component;

import com.st.springjd.dao.Empdao;
import com.st.springjd.pojo.EmployeePojo;
@Component
public class EmpService {
	@Autowired
	private Empdao empdao;
	
	public void save(EmployeePojo employeePojo) {
		empdao.save(employeePojo);
		
	}

}
