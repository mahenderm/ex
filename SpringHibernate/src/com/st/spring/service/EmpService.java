package com.st.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.st.spring.dao.EmpDao;
import com.st.spring.pojo.EmployeePojo;
@Component
public class EmpService {
	@Autowired
	private EmpDao empDao;
	
	public void saveEmp(EmployeePojo e){
		
		empDao.saveEmp(e);
		
	}

}
