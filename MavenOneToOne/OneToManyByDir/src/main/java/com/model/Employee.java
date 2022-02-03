package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	private int empid;
	private String empname;
	@ManyToOne(cascade = CascadeType.ALL)
	private Department d;
	
	
	public Department getD() {
		return d;
	}
	public void setD(Department d) {
		this.d = d;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
}
