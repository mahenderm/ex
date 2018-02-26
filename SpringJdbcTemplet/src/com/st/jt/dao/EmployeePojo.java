package com.st.jt.dao;

public class EmployeePojo {
	
	private int empno;
	private String empname;
	private String empaddr;
	
	private EmpDao ed;

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

	public EmpDao getEd() {
		return ed;
	}

	public void setEd(EmpDao ed) {
		this.ed = ed;
	}
	
	

}
