package net.scit.reboard.dao;

import java.util.List;

import net.scit.reboard.vo.Comments;

// import �� ���� �� ��

public interface CommentsMapper {

	// ��� ��� 
	public int insertComments(Comments comments);

	// ��� ��ü ��� ��ȸ
	public List<Comments> listReply(int houseNum);
	
	// ��� ���� ��ȸ
	public int countComments(int houseNum);

	// ��� 1�� ��ȸ
	public Comments readComments(int comNum);

	// ��� ����
	public int updateComments(Comments comments);

	// ��� ����
	public int deleteComments(int comNum);
}
