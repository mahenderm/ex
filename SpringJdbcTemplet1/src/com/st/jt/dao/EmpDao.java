package com.st.jt.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class EmpDao {
	@Autowired

	private DataSource dataSource;
	 public void saveUser() {
		 JdbcTemplate jt=new JdbcTemplate(dataSource);
		 jt.update("insert into employee values(999,'mmmmm','rrrr')");
		
		}
	/* private JdbcTemplate jdbcTemplate;
	 public void update() {
		 jdbcTemplate.update("insert into employee values(16,'kiran','chennai')"); 
	 }
	 public void changeName() {
		 
	 }
	*/


}
