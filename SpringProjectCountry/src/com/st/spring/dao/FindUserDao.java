package com.st.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.st.spring.pojo.UserPojo;

public class FindUserDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
public UserPojo findUser(String username) {
		
		String sql=("select * from login where username=?");
		//jdbcTemplate.queryForObject(sql, new Object[]{username} , RowMapper<T>());
		
		return jdbcTemplate.queryForObject(sql, new Object[]{username},new RowMapper()
		{
			
			
		public Object mapRow(ResultSet rs,int row1) throws SQLException {
			UserPojo u=new UserPojo();
			
			u.setId(rs.getInt(1));
			u.setUsername(rs.getString(2));
			u.setPassword(rs.getString(3));
			return u;
		}
		});
		
	}

}
