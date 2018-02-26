package com.st.spring.constructorarg;

public class Employee {
	private int eno;
	private String ename;
	private String address;
	public Employee(int eno, String ename, String address) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", address="
				+ address + "]";
	}
	
	

}
