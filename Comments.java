package net.scit.reboard.vo;

import java.util.Date;

public class Comments {
	private int comNum;
	private int houseNum;
	private String userId;
	private String text;
	private Date regDate;
	public Comments() {
		super();
	}
	public Comments(int comNum, int houseNum, String userId, String text, Date regDate) {
		super();
		this.comNum = comNum;
		this.houseNum = houseNum;
		this.userId = userId;
		this.text = text;
		this.regDate = regDate;
	}
	public int getComNum() {
		return comNum;
	}
	public void setComNum(int comNum) {
		this.comNum = comNum;
	}
	public int getHouseNum() {
		return houseNum;
	}
	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "Comments [comNum=" + comNum + ", houseNum=" + houseNum + ", userId=" + userId + ", text=" + text
				+ ", regDate=" + regDate + "]";
	}


}
