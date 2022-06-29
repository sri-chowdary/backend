package com.project.group2.Model;

import javax.persistence.*;

@Entity
@Table(name ="Admin")
public class Admin {
	
	private int AdminId;
	private String UserName;
	
	@Id
	public int getAdminId() {
		return AdminId;
	}
	public void setAdminId(int adminId) {
		AdminId = adminId;
	}
	public String getUserName() {
		return UserName;
	}
	public Admin() {
		super();
		
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	

}
