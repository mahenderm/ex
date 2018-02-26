 package com.st.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.st.spring.pojo.EmployeePojo;
@Component
public class EmpDao {
	@Autowired
	HibernateTemplate hibernateTemplate;
	public void saveEmp(EmployeePojo e){
		
		hibernateTemplate.save(e);
		
	}

}
