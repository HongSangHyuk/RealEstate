package net.scit.reboard.vo;

import java.util.Date;

public class Customer {
	private int custNum;
	private String custName ;
	private String custPhone;
	private char gender;
	private Date regDate ;
	public Customer() {
		super();
	}
	public Customer(int custNum, String custName, String custPhone, char gender, Date regDate) {
		super();
		this.custNum = custNum;
		this.custName = custName;
		this.custPhone = custPhone;
		this.gender = gender;
		this.regDate = regDate;
	}
	public int getCustNum() {
		return custNum;
	}
	public void setCustNum(int custNum) {
		this.custNum = custNum;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "Customer [custNum=" + custNum + ", custName=" + custName + ", custPhone=" + custPhone + ", gender="
				+ gender + ", regDate=" + regDate + "]";
	}
	

}
