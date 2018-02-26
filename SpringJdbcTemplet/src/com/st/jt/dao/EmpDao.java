package com.st.jt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.jsp.jstl.core.Config;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class EmpDao {
	@Autowired
	
	private JdbcTemplate jdbcTemplate;
	public void saveUser(){
		jdbcTemplate.update("insert into employee values(125,'sam','hyd')");
		
	}
	 public void changeName(int empno,String newname) {
		 jdbcTemplate.update("update employee set empname=? where empno=?",new Object[]{newname,empno});
	 }
	 public void empCreate(final EmployeePojo e) {
		 
		 jdbcTemplate.update(new PreparedStatementCreator() {
			
			public PreparedStatement createPreparedStatement(Connection con)
					throws SQLException {
				PreparedStatement pstmt=con.prepareStatement("insert into employee(?,?,?)");
				pstmt.setInt(1,e.getEmpno());
				pstmt.setString(2, e.getEmpname());
				pstmt.setString(3,e.getEmpaddr());
				return pstmt;
			}
		});
		 
		 }public void deletEmp(int empno) {
			 
			 jdbcTemplate.update("delete from employee where empno=?",new Object[]{empno});
	 
	 }
		 public List<EmployeePojo>getAllEmployee() {
				return jdbcTemplate.query("select * from employee",new RowMapper()
				{
				public Object mapRow(ResultSet rs,int rowno) throws SQLException {
					
					
					
					EmployeePojo e=new EmployeePojo();
					e.setEmpno(rs.getInt(1));
					e.setEmpname(rs.getString(2));
					e.setEmpaddr(rs.getString(3));
					return e;
				}
				});
			}
}
