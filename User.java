package net.scit.reboard.vo;

import java.util.Date;

public class User {
	private String userId;
	private char userType;
	private String userName;
	private String userPhone;
	private String userPwd;
	private Date regDate;
	
	public User() {
		super();
	}
	public User(String userId, char userType, String userName, String userPhone, String userPwd, Date regDate) {
		super();
		this.userId = userId;
		this.userType = userType;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userPwd = userPwd;
		this.regDate = regDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public char getUserType() {
		return userType;
	}
	public void setUserType(char userType) {
		this.userType = userType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userType=" + userType + ", userName=" + userName + ", userPhone="
				+ userPhone + ", userPwd=" + userPwd + ", regDate=" + regDate + "]";
	}
}									
