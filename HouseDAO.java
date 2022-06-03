package net.scit.reboard.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import net.scit.reboard.vo.Customer;
import net.scit.reboard.vo.House;

public class HouseDAO {
	SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	// 매물 등록 
	public int insertHouse(House house) {
		int result = 0;
		
		SqlSession session = null;
		session = factory.openSession();
		
// CODE HERE
		HouseMapper mapper = session.getMapper(HouseMapper.class);	
		result = mapper.insertHouse(house);

		session.commit();
		session.close();
		
		return result;
	}

	// 매물 전체 목록 조회
	public List<House> listHouse(){
		List<House> resultList = null;
		
		SqlSession session = null;
		session = factory.openSession();
		
// CODE HERE
		HouseMapper mapper = session.getMapper(HouseMapper.class);	
		resultList = mapper.listHouse();

		session.commit();
		session.close();
		
		return resultList;
	}
	
	// 매물 전체 갯수 조회
	public int countHouse() {
		int result = 0;
		
		SqlSession session = null;
		session = factory.openSession();
		
// CODE HERE
		HouseMapper mapper = session.getMapper(HouseMapper.class);	
		result = mapper.countHouse();

		session.commit();
		session.close();
		
		return result;

	}

	// 매물 1개 조회
	public House readHouse(int houseNum) {
		House resultHouse = null;
		
		SqlSession session = null;
		session = factory.openSession();
		
// CODE HERE
		HouseMapper mapper = session.getMapper(HouseMapper.class);	
		resultHouse = mapper.readHouse(houseNum);

		session.commit();
		session.close();
		
		return resultHouse;
	}

	// 매물 수정
	public int updateHouse(House house) {
		int result = 0;
		
		SqlSession session = null;
		session = factory.openSession();
		
// CODE HERE
		HouseMapper mapper = session.getMapper(HouseMapper.class);	
		result = mapper.updateHouse(house);

		session.commit();
		session.close();
		
		return result;

	}

	// 매물 삭제
	public int deleteHouse(int houseNum) {
		int result = 0;
		
		SqlSession session = null;
		session = factory.openSession();
		
// CODE HERE
		HouseMapper mapper = session.getMapper(HouseMapper.class);	
		result = mapper.deleteHouse(houseNum);

		session.commit();
		session.close();
		
		return result;

	}
}
