package net.scit.reboard.dao;

import java.util.List;

import net.scit.reboard.vo.House;

// import 는 새로 할 것

public interface HouseMapper {

	// 매물 등록 
	public int insertHouse(House house);

	// 매물 전체 목록 조회
	public List<House> listHouse();
	
	// 매물 전체 갯수 조회
	public int countHouse();

	// 매물 1개 조회
	public House readHouse(int housenum);

	// 매물 수정
	public int updateHouse(House house);

	// 매물 삭제
	public int deleteHouse(int housenum);
}
