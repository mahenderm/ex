package com.st.spring.pojo;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class User {
	@NotBlank //@NotBlank("message=please enter valid first name")
	private String fname;
	@NotEmpty
	private String lname;
	@NotEmpty
	@Email
	private String email;
	private Long mobile;
	private String coursename;
	
	
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMoblile(Long mobile) {
		this.mobile = mobile;
	}
	
	

}
