package com.st.springjd.pojo;

public class EmployeePojo {
	private int empno;
	private String empname;
	private String empaddr;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpaddr() {
		return empaddr;
	}
	public void setEmpaddr(String empaddr) {
		this.empaddr = empaddr;
	}
	@Override
	public String toString() {
		return "EmployeePojo [empno=" + empno + ", empname=" + empname
				+ ", empaddr=" + empaddr + "]";
	}
	
	

}
