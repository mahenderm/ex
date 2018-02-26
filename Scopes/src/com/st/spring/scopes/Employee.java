package com.st.spring.scopes;

public class Employee {
	
	private int eno;
	private String ename;
	private String address;
	

	
	public Employee(int eno, String ename, String address) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.address = address;
		System.out.println("----Employee object created---------");
		
	}
	@Override
	public String toString() {
		return "Emloyee [eno=" + eno + ", ename=" + ename + ", address="
				+ address + "]";
	}
	
	
	

}
