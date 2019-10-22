package org.naruto.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.naruto.domain.BoardVO;
import org.naruto.util.MyBatisLoader;
import org.zerock.dto.PagingDTO;

public class BoardDAOImple implements BoardDAO {
	private SqlSessionFactory factory = MyBatisLoader.INSTANCE.getFactory();
	@Override
	public BoardVO select(Long bno) {
		BoardVO result = null;
		try {

			SqlSession session = factory.openSession();
			 result = session.selectOne("org.naruto.dao.BoardMapper.select",bno);
			 System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}



	@Override
	public boolean insert(BoardVO vo) {
		// TODO Auto-generated method stub
		boolean result = false;
		int a = 0;
		try {

			SqlSession session = factory.openSession();
			 a = session.insert("org.naruto.dao.BoardMapper.insert",vo);
			 session.commit();
			 System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();
		}
		result=a==1?true:false;
		return result;
	}

	@Override
	public boolean update(BoardVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Long key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<BoardVO> getList(PagingDTO dto) {
		List<BoardVO> result = null;

		try (SqlSession session = factory.openSession()) {

			result = session.selectList("org.naruto.dao.BoardMapper.selectList",dto);
			System.out.println(result);

		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
//	public static void main(String[] args) {
//		BoardDAO dao = new BoardDAOImple();
//		PagingDTO dto = new PagingDTO();
//		dto.setPage(2);
//		dto.setAmount(10);
//		List<BoardVO> list = dao.getList(dto);
//		list.forEach(board -> System.out.println(board));
//	}
}
