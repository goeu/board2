package org.naruto.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.naruto.util.MyBatisLoader;

public class TimeDAOImple implements TimeDAO {
	private SqlSessionFactory factory = MyBatisLoader.INSTANCE.getFactory();
	@Override
	public String getTime() {
		String result = "";
		try {
		
			SqlSession session = factory.openSession();
			 result = session.selectOne("org.naruto.dao.TimeMapper.getTime");
			 System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	public static void main(String[] args) {
		TimeDAO dao = new TimeDAOImple();
		dao.getTime();
	}
	
}
