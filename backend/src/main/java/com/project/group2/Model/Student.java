package com.project.group2.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	
	@Id
	private String Username;
	private String password;
	private String Branch;
	private String Degree;
	
	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getDegree() {
		return Degree;
	}
	public void setDegree(String degree) {
		Degree = degree;
	}
	public Student() {
		super();
		
	}
	@Override
	public String toString() {
		return "Student [Username=" + Username + ", password=" + password + ", Branch=" + Branch + ", Degree=" + Degree
				+ "]";
	}
	

}
