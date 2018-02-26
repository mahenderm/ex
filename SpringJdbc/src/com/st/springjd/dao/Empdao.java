package com.st.springjd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.jsp.tagext.TryCatchFinally;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.st.springjd.pojo.EmployeePojo;


@Component
public class Empdao {
	@Autowired
	private BasicDataSource basicDataSource;

	public BasicDataSource getBasicDataSource() {
		return basicDataSource;
	}

	public void setBasicDataSource(BasicDataSource basicDataSource) {
		this.basicDataSource = basicDataSource;
	}
	
	public void save(EmployeePojo employeePojo) {
		try {
			
			Connection con=basicDataSource.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
			
			EmployeePojo emp=new EmployeePojo();
			
			emp.setEmpno(114);
			emp.setEmpname("chiru");
			emp.setEmpaddr("malkajgiri");
			
			ps.setInt(1,emp.getEmpno());
			ps.setString(2,emp.getEmpname());
			ps.setString(3,emp.getEmpaddr());
			
			
			ps.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
		
		
	}
	


