package com.gy.domain;

import java.util.Date;

public class Employee {
	private Integer eid;
	private String ename;
	private String email;
	//private Date bithday;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	public Date getBithday() {
//		return bithday;
//	}
//	public void setBithday(Date bithday) {
//		this.bithday = bithday;
//	}
}
