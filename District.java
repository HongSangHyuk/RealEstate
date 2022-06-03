package net.scit.reboard.vo;

import java.util.Date;

public class District {
	private int dongNum;
	private String cityName;
	private String guName;
	private String dongName;
	private Date regDate;
	public District() {
		super();
	}
	public District(int dongNum, String cityName, String guName, String dongName, Date regDate) {
		super();
		this.dongNum = dongNum;
		this.cityName = cityName;
		this.guName = guName;
		this.dongName = dongName;
		this.regDate = regDate;
	}
	public int getDongNum() {
		return dongNum;
	}
	public void setDongNum(int dongNum) {
		this.dongNum = dongNum;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getGuName() {
		return guName;
	}
	public void setGuName(String guName) {
		this.guName = guName;
	}
	public String getDongName() {
		return dongName;
	}
	public void setDongName(String dongName) {
		this.dongName = dongName;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "District [dongNum=" + dongNum + ", cityName=" + cityName + ", guName=" + guName + ", dongName="
				+ dongName + ", regDate=" + regDate + "]";
	}

}
