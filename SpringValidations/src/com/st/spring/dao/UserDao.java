package com.st.spring.dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.st.spring.pojo.Course;

public class UserDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public List<Course> getAllCourses(){
	return jdbcTemplate.query("select * from course", new RowMapper()
	{
		
		
	public Object mapRow(ResultSet rs,int row) throws SQLException {
		Course course=new Course();
		
		course.setId(rs.getInt(1));
		course.setCoursename(rs.getString(2));
		return course;
		
	}
	});
	}

}
