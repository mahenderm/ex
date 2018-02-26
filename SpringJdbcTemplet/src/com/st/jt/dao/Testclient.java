package com.st.jt.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testclient {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	/*	EmpDao emp=(EmpDao)context.getBean("empDao");
		emp.saveUser();*/
		/*EmpDao emp=context.getBean("empDao",EmpDao.class);
		emp.changeName(999,"rams");*/
		//EmployeePojo e=(EmployeePojo)context.getBean("employeePojo");
		/*EmployeePojo e=new EmployeePojo();	
		e.setEmpno(444);
		e.setEmpname("hai");
		e.setEmpaddr("pune");
		emp.empCreate(emp)*/
	
		/*EmpDao emp=(EmpDao)context.getBean("empDao");
		emp.deletEmp(999);*/

		EmpDao emp=(EmpDao)context.getBean("empDao");
		List<EmployeePojo> elist=emp.getAllEmployee();
		for(EmployeePojo m:elist){
			System.out.println(m.getEmpname());
		System.out.println(m.getEmpno());
			System.out.println(m.getEmpaddr());
		}
		
		
		
	}

}
