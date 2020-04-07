package com.capg.springboot.model;

public class User {
	private int userId;
	private String userName;
	private String email;
	private long phoneNo;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String userName, String email, long phoneNo) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.phoneNo = phoneNo;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", phoneNo=" + phoneNo + "]";
	}

	
}
