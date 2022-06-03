package net.scit.reboard.dao;

import java.util.List;

import net.scit.reboard.vo.Comments;

// import 는 새로 할 것

public interface CommentsMapper {

	// 댓글 등록 
	public int insertComments(Comments comments);

	// 댓글 전체 목록 조회
	public List<Comments> listReply(int houseNum);
	
	// 댓글 갯수 조회
	public int countComments(int houseNum);

	// 댓글 1개 조회
	public Comments readComments(int comNum);

	// 댓글 수정
	public int updateComments(Comments comments);

	// 댓글 삭제
	public int deleteComments(int comNum);
}
