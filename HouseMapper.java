package net.scit.reboard.dao;

import java.util.List;

import net.scit.reboard.vo.House;

// import �� ���� �� ��

public interface HouseMapper {

	// �Ź� ��� 
	public int insertHouse(House house);

	// �Ź� ��ü ��� ��ȸ
	public List<House> listHouse();
	
	// �Ź� ��ü ���� ��ȸ
	public int countHouse();

	// �Ź� 1�� ��ȸ
	public House readHouse(int housenum);

	// �Ź� ����
	public int updateHouse(House house);

	// �Ź� ����
	public int deleteHouse(int housenum);
}
