package net.scit.reboard.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import net.scit.reboard.vo.Comments;
import net.scit.reboard.vo.House;

public class CommentsDAO {
	SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();

	// ��� ��� 
	public int insertComments(Comments comments) {
		int result = 0;
		
		SqlSession session = null;
		session = factory.openSession();
		
// CODE HERE
		CommentsMapper mapper = session.getMapper(CommentsMapper.class);	
		result = mapper.insertComments(comments);

		session.commit();
		session.close();
		
		return result;
	}

	// ��� ��ü ��� ��ȸ
	public List<Comments> listReply(int houseNum){
		List<Comments> resultList = null;
		
		SqlSession session = null;
		session = factory.openSession();
		
// CODE HERE
		CommentsMapper mapper = session.getMapper(CommentsMapper.class);	
		resultList = mapper.listReply(houseNum);

		session.commit();
		session.close();
		
		return resultList;
	}
	
	// ��� ���� ��ȸ
	public int countComments(int houseNum) {
		int result = 0;
		
		SqlSession session = null;
		session = factory.openSession();
		
// CODE HERE
		CommentsMapper mapper = session.getMapper(CommentsMapper.class);	
		result = mapper.countComments(houseNum);

		session.commit();
		session.close();
		
		return result;
	}

	// ��� 1�� ��ȸ
	public Comments readComments(int comNum) {
		Comments resultComments = null;
		
		SqlSession session = null;
		session = factory.openSession();
		
// CODE HERE
		CommentsMapper mapper = session.getMapper(CommentsMapper.class);	
		resultComments = mapper.readComments(comNum);

		session.commit();
		session.close();
		
		return resultComments;
	}

	// ��� ����
	public int updateComments(Comments comments) {
		int result = 0;
		
		SqlSession session = null;
		session = factory.openSession();
		
// CODE HERE
		CommentsMapper mapper = session.getMapper(CommentsMapper.class);	
		result = mapper.updateComments(comments);

		session.commit();
		session.close();
		
		return result;
	}

	// ��� ����
	public int deleteComments(int comNum) {
		int result = 0;
		
		SqlSession session = null;
		session = factory.openSession();
		
// CODE HERE
		CommentsMapper mapper = session.getMapper(CommentsMapper.class);	
		result = mapper.deleteComments(comNum);

		session.commit();
		session.close();
		
		return result;
	}

}
