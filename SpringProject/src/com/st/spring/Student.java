package com.st.spring;

public class Student {
	
	private int sno;
	private String sname;
	private String address;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", address="
				+ address + "]";
	}
	
	

}
