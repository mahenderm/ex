package com.st.spring.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.st.spring.Pojo.UserPojo;

public class UserDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<UserPojo> loginUser(String username,String password){
		
	
		//String sqlStmt=("select * from login where username='"+username+"',and password='"+password+"' ");
		//System.out.println(sqlStmt);
		return jdbcTemplate.query("select * from login where username='"+username+"' and password='"+password+"' ", new RowMapper()
		{
			
			
		public Object mapRow(ResultSet rs,int row1) throws SQLException {
			UserPojo userPojo=new UserPojo();
			
			userPojo.setUsername(rs.getString("username"));
			userPojo.setPassword(rs.getString("password"));
			return userPojo;
		}
		}
		);
	}
	//get one record into database
	public UserPojo getUser(String username) {
		
		String sql=("select * from login where username=?");
		//jdbcTemplate.queryForObject(sql, new Object[]{username} , RowMapper<T>());
		
		return jdbcTemplate.queryForObject(sql, new Object[]{username},new RowMapper()
		{
			
			
		public Object mapRow(ResultSet rs,int row1) throws SQLException {
			UserPojo userPojo=new UserPojo();
			
			userPojo.setId(rs.getInt("id"));
			userPojo.setUsername(rs.getString("username"));
			userPojo.setPassword(rs.getString("password"));
			return userPojo;
		}
		}
		);
		
	}
	public List<UserPojo> getAllUsers() {
		
		String sql="select * from login";
		
		return jdbcTemplate.query(sql,new RowMapper()
		{
			public Object mapRow(ResultSet rs,int row1) throws SQLException {
				
				
				UserPojo userPojo=new UserPojo();
				userPojo.setId(rs.getInt("id"));
				userPojo.setUsername(rs.getString("username"));
				userPojo.setPassword(rs.getString("password"));
				return userPojo;
			}
		});
	}

	public void regUser(final UserPojo u) {
		jdbcTemplate.update(new PreparedStatementCreator() {
			
			public PreparedStatement createPreparedStatement(Connection con)
					throws SQLException {
				
				PreparedStatement pstmt=con.prepareStatement("insert into user values(?,?,?)");
				pstmt.setInt(1,u.getId());
				pstmt.setString(2, u.getUsername());
				pstmt.setString(3,u.getPassword());
				
				return pstmt;
			}
		});
		
	}
/*	public String findUser(String username){
		return username;
		
	}
*/
}
