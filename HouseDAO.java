package net.scit.reboard.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import net.scit.reboard.vo.Customer;
import net.scit.reboard.vo.House;

public class HouseDAO {
	SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	// �Ź� ��� 
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

	// �Ź� ��ü ��� ��ȸ
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
	
	// �Ź� ��ü ���� ��ȸ
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

	// �Ź� 1�� ��ȸ
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

	// �Ź� ����
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

	// �Ź� ����
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
