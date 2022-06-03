package net.scit.reboard.vo;

import java.util.Date;

public class House {
	private int houseNum;
	private char houseType;
	private int houseSize;
	private int dongNum;
	private String address;
	private String roomUnit;
	private int custNum;
	private char sellType;
	private char sellStatus;
	private int price;
	private int deposit;
	private int monthlyFee;
	private int goodCount;
	private int hitCount;
	private Date regDate;
	public House() {
		super();
	}
	public House(int houseNum, char houseType, int houseSize, int dongNum, String address, String roomUnit, int custNum,
			char sellType, char sellStatus, int price, int deposit, int monthlyFee, int goodCount, int hitCount,
			Date regDate) {
		super();
		this.houseNum = houseNum;
		this.houseType = houseType;
		this.houseSize = houseSize;
		this.dongNum = dongNum;
		this.address = address;
		this.roomUnit = roomUnit;
		this.custNum = custNum;
		this.sellType = sellType;
		this.sellStatus = sellStatus;
		this.price = price;
		this.deposit = deposit;
		this.monthlyFee = monthlyFee;
		this.goodCount = goodCount;
		this.hitCount = hitCount;
		this.regDate = regDate;
	}
	public int getHouseNum() {
		return houseNum;
	}
	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}
	public char getHouseType() {
		return houseType;
	}
	public void setHouseType(char houseType) {
		this.houseType = houseType;
	}
	public int getHouseSize() {
		return houseSize;
	}
	public void setHouseSize(int houseSize) {
		this.houseSize = houseSize;
	}
	public int getDongNum() {
		return dongNum;
	}
	public void setDongNum(int dongNum) {
		this.dongNum = dongNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRoomUnit() {
		return roomUnit;
	}
	public void setRoomUnit(String roomUnit) {
		this.roomUnit = roomUnit;
	}
	public int getCustNum() {
		return custNum;
	}
	public void setCustNum(int custNum) {
		this.custNum = custNum;
	}
	public char getSellType() {
		return sellType;
	}
	public void setSellType(char sellType) {
		this.sellType = sellType;
	}
	public char getSellStatus() {
		return sellStatus;
	}
	public void setSellStatus(char sellStatus) {
		this.sellStatus = sellStatus;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getMonthlyFee() {
		return monthlyFee;
	}
	public void setMonthlyFee(int monthlyFee) {
		this.monthlyFee = monthlyFee;
	}
	public int getGoodCount() {
		return goodCount;
	}
	public void setGoodCount(int goodCount) {
		this.goodCount = goodCount;
	}
	public int getHitCount() {
		return hitCount;
	}
	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "HouseDAO [houseNum=" + houseNum + ", houseType=" + houseType + ", houseSize=" + houseSize + ", dongNum="
				+ dongNum + ", address=" + address + ", roomUnit=" + roomUnit + ", custNum=" + custNum + ", sellType="
				+ sellType + ", sellStatus=" + sellStatus + ", price=" + price + ", deposit=" + deposit
				+ ", monthlyFee=" + monthlyFee + ", goodCount=" + goodCount + ", hitCount=" + hitCount + ", regDate="
				+ regDate + "]";
	}

}
